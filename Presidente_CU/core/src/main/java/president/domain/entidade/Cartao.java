package president.domain.entidade;

import president.domain.objetos_de_valor.identificador.ID_Cartao;
import president.domain.objetos_de_valor.Valor_Cartao;
import president.domain.objetos_de_valor.Naipes;

public class Cartao {
    
    private final ID_Cartao id_Cartao;
    private final Valor_Cartao valor_Carta;
    private final Naipes naipes;

    private Cartao(final ID_Cartao id_Cartao, final Valor_Cartao valor_Carta, final Naipes naipes) {
        this.id_Cartao = id_Cartao;
        this.valor_Carta = valor_Carta;
        this.naipes = naipes;
    }

    public static Cartao of(final Valor_Cartao valor_Carta, final Naipes naipes) {
        return new Cartao(ID_Cartao.of(), valor_Carta, naipes);
    }

    public ID_Cartao getID_Cartao() {
        return id_Cartao;
    }

    public Valor_Cartao getValor_Cartao() {
        return valor_Carta;
    }

    public Naipes getNaipes() {
        return naipes;
    }

    @Override
    public String toString() {
        return this.valor_Carta + " de " + this.naipes;
    }

//     @Override
//     public int compareTo(final Cartao o) {
//         return o.getValor_Cartao().getValor() - this.getValor_Cartao().getValor();
//     }
}
