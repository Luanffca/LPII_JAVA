package president.domain.objetos_de_valor;

import java.util.Comparator;

public enum Valor_Cartao implements Objetos_de_Valor{
    
    ACE(12),
    DOIS(13),
    TRES(1),
    QUATRO(2),
    CINCO(3),
    SEIS(4),
    SETE(5),
    OITO(6),
    NOVE(7),
    DEZ(8),
    VALETE(9),
    DAMA(10),
    REI(11);

    private final int valor;

    Valor_Cartao(final int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public int compare(final Valor_Cartao c) {
        return this.getValor() - c.getValor();
    }
}
