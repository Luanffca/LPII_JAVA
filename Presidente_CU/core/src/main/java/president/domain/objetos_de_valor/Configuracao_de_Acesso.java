package president.domain.objetos_de_valor;

import java.beans.Visibility;

public class Configuracao_de_Acesso implements Objetos_de_Valor{
    
    private final static int MIN_JOGADORES = 4;
    private final int MAX_JOGADORES;
    private final int Hora_do_Proximo_Jogador;
    private final Visibility visibilidade;

    private Configuracao_de_Acesso(
            final int MAX_JOGADORES,
            final int Hora_do_Proximo_Jogador,
            final Visibility visibilidade) {

        this.MAX_JOGADORES = MAX_JOGADORES;
        this.Hora_do_Proximo_Jogador = Hora_do_Proximo_Jogador;
        this.visibilidade = visibilidade;

    }

    public static Configuracao_de_Acesso ofPublic(
            final int MAX_JOGADORES) {

        return Configuracao_de_Acesso.of(
                MAX_JOGADORES,
                Visibility.PUBLIC
        );
    }

    public static Configuracao_de_Acesso ofPrivate(
            final int MAX_JOGADORES) {

        return Configuracao_de_Acesso.of(
                MAX_JOGADORES,
                Visibility.PRIVATE
        );
    }

    public static Configuracao_de_Acesso of(
            final int MAX_JOGADORES,
            final Visibility visibilidade) {

        if (MAX_JOGADORES < Configuracao_de_Acesso.MIN_JOGADORES) {
            throw new RuntimeException("máximo de jogadores não pode ser menor que quatro");
        }

        if (MAX_JOGADORES > 13) {
            throw new RuntimeException(
                    "máximo de jogadores não pode ser maior que 13"
            );
        }

        return new Configuracao_de_Acesso(
                MAX_JOGADORES,
                15,
                visibilidade
        );

    }

    public int getMIN_JOGADORES() {
        return MIN_JOGADORES;
    }

    public int getMAX_JOGADORES() {
        return MAX_JOGADORES;
    }

    public int getHora_do_Proximo_Jogador() {
        return Hora_do_Proximo_Jogador;
    }

    public Visibility getVisibilidade() {
        return visibilidade;
    }

    public enum Visibility {
        PUBLIC, PRIVATE
    }

}
