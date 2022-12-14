package president.domain.objetos_de_valor.identificador;

import java.util.UUID;

public class ID_da_Sala extends ID_Base {

    protected ID_da_Sala(UUID valor) {
        super(valor);
    }

    public static ID_da_Sala of() {
        return new ID_da_Sala(UUID.randomUUID());
    }

    public static ID_da_Sala of(UUID valor) {
        return new ID_da_Sala(valor);
    }
    
}
