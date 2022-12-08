// Criando Link da Sala
package Presidente_CU.objetos_de_valor;

import java.util.UUID;

public class Link_da_Sala implements Objetos_de_Valor{
    
    private final UUID valor;

    private Link_da_Sala(final UUID valor){
        this.valor = valor;
    }

    public static Link_da_Sala of(){
        return new Link_da_Sala(UUID.randomUUID());
    }

    public UUID getValor(){
        return valor;
    }
}
