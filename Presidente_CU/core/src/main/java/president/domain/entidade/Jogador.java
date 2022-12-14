package president.domain.entidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import president.domain.objetos_de_valor.identificador.ID_do_jogador;

public class Jogador implements Comparable<Jogador> {

    private static ID_do_jogador ID_do_jogador;
    private String nomeNick;
    private List<Cartao> cartas;
    private Cartao escolheCartao;

    private Jogador(
            final ID_do_jogador ID_do_jogador,
            final String nomeNick,
            final List<Cartao> cartas,
            final Cartao escolheCartao) {

        this.ID_do_jogador = ID_do_jogador;
        this.nomeNick = nomeNick;
        this.cartas = cartas;
        this.escolheCartao = escolheCartao;
    }

    public static Jogador of(final String nomeNick) {

        return new Jogador(
                ID_do_jogador.of(),
                nomeNick,
                new ArrayList<>(),
                null
        );
    }

    public void Escolhe_Cartao(final Cartao cartas) {
        this.escolheCartao = cartas;
    }

    public void addCartas(final Cartao cartas) {
        this.cartas.add(cartas);
    }

    public ID_do_jogador getID_jogado() {
        return ID_do_jogador;
    }

    public String getNomeNick() {
        return nomeNick;
    }

    public List<Cartao> getCartas() {
        return Collections.unmodifiableList(cartas);
    }

    public Cartao getEscolher_Cartao() {
        return escolheCartao;
    }

    @Override
    public int compareTo(final Jogador o) {
        return o.escolheCartao.getValor_Cartao().getValor() - this.escolheCartao.getValor_Cartao().getValor();
    }

    
}
