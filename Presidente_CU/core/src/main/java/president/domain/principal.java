package president.domain;

import president.domain.entidade.Jogador;
import president.domain.entidade.Sala;
import president.domain.objetos_de_valor.Configuracao_de_Acesso;

public class principal {
    public static void main(String[] args) {
        final Jogador p1 = Jogador.of("Lara");
        final Jogador p2 = Jogador.of("Mel");
        final Jogador p3 = Jogador.of("feericles");
        final Jogador p4 = Jogador.of("doquinha-e-coxinha");

        final Sala sala = Sala.of(p1, Configuracao_de_Acesso.ofPrivate(4));

        sala.addPlayer(p2);
        sala.addPlayer(p3);
    //        room.addPlayer(p4);
    ////
    //        room.toSorting();
    //
    //        room.choiceCard(p1);
    //        room.choiceCard(p2);
    //        room.choiceCard(p3);
    //        room.choiceCard(p4);
    //
    //        room.sortPlayers();

    //        room.dealCards();

    //        print(room);

        sala.dealCards();
        System.out.println("-------------------------");
        p1.getCartas().forEach(System.out::println);
        System.out.println(p1.getCartas().size());

        System.out.println("-------------------------");
        p2.getCartas().forEach(System.out::println);
        System.out.println(p2.getCartas().size());

        System.out.println("-------------------------");
        p3.getCartas().forEach(System.out::println);
        System.out.println(p3.getCartas().size());

        System.out.println("-------------------------");
        p4.getCartas().forEach(System.out::println);
        System.out.println(p4.getCartas().size());

        System.out.println("-------------------------");

    }

    private static void print(final Sala room) {
        System.out.println("ID da sala: " + room.getID_da_Sala().getValor());
        System.out.println("Proprietario: " + room.getproprietario().getNomeNick());
        System.out.println("Jogadores: " + room.getjogadores().size());
        room.getjogadores().forEach((p) -> {
            if (p.getEscolher_Cartao() != null)
                System.out.println("Jogadores: %s  | Card: %s".format(p.getNomeNick(), p.getEscolher_Cartao().getValor_Cartao()));
        });
        System.out.println("Status: " + room.getStatus());
        System.out.println("Link value: " + room.getLink_da_Sala().getValor());
        System.out.println("Min jogadores: " + room.getConfiguracao_de_Acesso().getMIN_JOGADORES());
        System.out.println("Max jogadores: " + room.getConfiguracao_de_Acesso().getMAX_JOGADORES());
        System.out.println("Time of next player: " + room.getConfiguracao_de_Acesso().getHora_do_Proximo_Jogador());
        System.out.println("Visibility: " + room.getConfiguracao_de_Acesso().getVisibilidade());
    }
}
