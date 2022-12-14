package president.domain.objetos_de_valor.identificador;
import president.domain.objetos_de_valor.Objetos_de_Valor;
import java.util.Objects;
import java.util.UUID;

public class ID_Base implements Objetos_de_Valor {

    private final UUID valor;

    protected ID_Base(final UUID valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_Base baseId = (ID_Base) o;
        return valor.equals(baseId.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
    
}
