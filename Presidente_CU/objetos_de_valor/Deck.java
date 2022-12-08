package Presidente_CU.objetos_de_valor;
import Presidente_CU.entidade.Cartao;

public class Deck implements Objetos_de_Valor {

    private final Cartao[] cartoes;
    
    private Deck() {
        this.cartoes = new Cartao[52];
        for (final Valor_Cartao card : Valor_Cartao.values()) {
            for (final Naipes suit : Naipes.values()) {
                cartoes[card.ordinal() + suit.ordinal() * 13] = Cartao.of(card, suit);
            }
        }
    }
    
    
    public static Deck of() {
        return new Deck();
    }
    
    public Cartao[] getCartaos() {
        return cartoes;
    }
    
    
} 

