package president.domain.objetos_de_valor.identificador;
import java.util.UUID;

public class ID_Cartao extends ID_Base{
    
    private ID_Cartao(final UUID Valor) {
        super(Valor);
    }

    public static ID_Cartao of() {
        return new ID_Cartao(UUID.randomUUID());
    }

    public static ID_Cartao of(final UUID Valor) {
        return new ID_Cartao(Valor);
    }
}
