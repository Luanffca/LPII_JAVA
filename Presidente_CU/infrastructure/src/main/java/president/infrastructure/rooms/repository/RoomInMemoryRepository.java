package president.infrastructure.rooms.repository;

import president.domain.entidade.Sala;
import president.domain.repositorio.Repositorio_Sala;
import president.domain.objetos_de_valor.identificador.ID_da_Sala;

import java.util.HashMap;
import java.util.Map;

public class RoomInMemoryRepository implements Repositorio_Sala {

    private final static Map<String, Sala> ROOMS = new HashMap<>();

    @Override
    public Sala salva(Sala aRoom) {
        ROOMS.put(aRoom.getID_da_Sala().getValor(), aRoom);
        return aRoom;
    }

    @Override
    public void deleta(ID_da_Sala anId) {
        ROOMS.remove(anId.getValor());
    }

    @Override
    public Sala getById(ID_da_Sala anId) {
        return ROOMS.get(anId.getValor());
    }

    @Override
    public Sala getByLink(String aLink) {
        return null;
    }

}
