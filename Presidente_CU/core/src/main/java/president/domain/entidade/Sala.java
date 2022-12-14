package president.domain.entidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


import president.domain.objetos_de_valor.Configuracao_de_Acesso;
import president.domain.objetos_de_valor.Deck;
import president.domain.objetos_de_valor.Link_da_Sala;
import president.domain.objetos_de_valor.Naipes;
import president.domain.objetos_de_valor.Valor_Cartao;
import president.domain.objetos_de_valor.identificador.ID_da_Sala;
import president.domain.objetos_de_valor.identificador.ID_do_jogador;

public class Sala {

    private final static int N_DECKS = 2;
    private final ID_da_Sala ID_da_Sala;
    private Jogador proprietario;
    private final Link_da_Sala Link_da_Sala;
    private Configuracao_de_Acesso Configuracao_de_Acesso;
    private List<Jogador> jogadores;
    private List<ID_do_jogador> Jogadores_a_escolha;
    private List<Cartao> cartoes_a_escolha;
    private List<Cartao> cartas_para_negociar;
    private Status status;

    private Sala(
            final ID_da_Sala ID_da_Sala,
            final Jogador proprietario,
            final Link_da_Sala Link_da_Sala,
            final Configuracao_de_Acesso Configuracao_de_Acesso,
            final List<Jogador> jogadores) {

        this.ID_da_Sala = ID_da_Sala;
        this.proprietario = proprietario;
        this.Link_da_Sala = Link_da_Sala;
        this.Configuracao_de_Acesso = Configuracao_de_Acesso;
        this.jogadores = jogadores;
        this.cartoes_a_escolha = new ArrayList<>();
        this.cartas_para_negociar = new ArrayList<>();

        initializejogadores(jogadores);

        this.status = Status.WAITING;

    }

    public void dealCards() {

        int qtyCardsOfRemove = (N_DECKS * 52) % jogadores.size();

        for (int i = 0; i < N_DECKS; i++) {
            for (final Cartao card : Deck.of().getCartaos()) {
                if (card.getValor_Cartao().equals(Valor_Cartao.TRES) && qtyCardsOfRemove > 0) {
                    qtyCardsOfRemove--;
                    continue;
                }
                cartas_para_negociar.add(card);
            }
        }

        Collections.shuffle(cartas_para_negociar);

        int jogador_atual = 0;

        for (final Cartao cartas : cartas_para_negociar) {
            jogadores.get(jogador_atual).addCartas(cartas);
            jogador_atual = (jogador_atual + 1) % jogadores.size();
        }

    }

    private void initializejogadores(List<Jogador> jogadores) {
        this.Jogadores_a_escolha = new ArrayList<>(
                jogadores.stream().map(p -> p.getID_jogado()).collect(Collectors.toList())
        );
    }

    public void toSorting() {

        if (status != Status.WAITING) {
            throw new IllegalStateException("O quarto não está esperando");
        }

        shufflecartoes_a_escolha();
        this.status = Status.IN_SORTING;

    }

    private void shufflecartoes_a_escolha() {

        if (jogadores.size() < Configuracao_de_Acesso.getMIN_JOGADORES()) {
            throw new RuntimeException("min jogadores' não pode ser inferior a quatro!");
        }

        for (final Valor_Cartao cardValue : Valor_Cartao.values()) {
            cartoes_a_escolha.add(Cartao.of(cardValue, Naipes.PAUS));
        }

        Collections.shuffle(cartoes_a_escolha);

    }

    public static Sala of(final Jogador proprietario, final Configuracao_de_Acesso Configuracao_de_Acesso) {

        final ID_da_Sala id_dasala = president.domain.objetos_de_valor.identificador.ID_da_Sala.of();
        final Link_da_Sala link_dasala = president.domain.objetos_de_valor.Link_da_Sala.of();
        final ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(proprietario);

        return new Sala(
                id_dasala,
                proprietario,
                link_dasala,
                Configuracao_de_Acesso,
                jogadores);

    }

    public Cartao escolheCarta(final Jogador jogador) {

        if (status != Status.IN_SORTING) {
            throw new IllegalStateException("A sala não está esperando");
        }

        if (!Jogadores_a_escolha.contains(jogador.getID_jogado())) {
            throw new IllegalArgumentException(
                    "Não é possível escolher o cartão para o jogador " + jogador.getID_jogado().getValor());
        }

        final Cartao card = cartoes_a_escolha.get(0);
        jogador.Escolhe_Cartao(card);
        cartoes_a_escolha.remove(card);
        Jogadores_a_escolha.remove(jogador.getID_jogado());

        return card;

    }

    public void sortjogadores() {
        if (Jogadores_a_escolha.isEmpty()) {
            jogadores.sort(Jogador::compareTo);
            toThrowing();
        }
    }

    void toThrowing() {

        if (status != Status.IN_SORTING && status != Status.ROUND_FINISHED) {
            throw new IllegalStateException("Os jogadores mínimos não podem ser inferiores a quatro!!");
        }

        this.status = Status.THROWING_CARDS;
    }

    public void toInGame() {

        if (status != Status.THROWING_CARDS) {
            throw new IllegalStateException("A sala nao esta em classificacao ou terminada em rodada");
        }

        status = Status.IN_GAME;

    }

    public void addPlayer(final Jogador player) {

        if (jogadores.size() >= Configuracao_de_Acesso.getMAX_JOGADORES()) {
            throw new RuntimeException("Esta sala está cheia!");
        }

        this.jogadores.add(player);
        this.Jogadores_a_escolha.add(player.getID_jogado());

    }

    public ID_da_Sala getID_da_Sala() {
        return ID_da_Sala;
    }

    public Jogador getproprietario() {
        return proprietario;
    }

    public Link_da_Sala getLink_da_Sala() {
        return Link_da_Sala;
    }

    public Configuracao_de_Acesso getConfiguracao_de_Acesso() {
        return Configuracao_de_Acesso;
    }

    public List<Jogador> getjogadores() {
        return jogadores;
    }

    public Status getStatus() {
        return status;
    }

    public List<Cartao> getcartas_para_negociar() {
        return Collections.unmodifiableList(cartas_para_negociar);
    }

    public enum Status {
        WAITING, IN_SORTING, THROWING_CARDS, IN_GAME, ROUND_FINISHED, GAME_FINISHED

    }
}