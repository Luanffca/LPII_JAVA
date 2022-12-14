package president.domain.objetos_de_valor.identificador;

import java.util.UUID;

public class ID_do_jogador extends ID_Base {

    private ID_do_jogador(UUID valor) {
        super(valor);
    }

    public static ID_do_jogador of() {
        return new ID_do_jogador(UUID.randomUUID());
    }

    public static ID_do_jogador of(final UUID valor) {
        return new ID_do_jogador(valor);
    }
    
}
