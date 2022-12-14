package president.application.usecase.room.retrieve.by.id;

import president.domain.objetos_de_valor.identificador.ID_da_Sala;

public interface RetrieveRoomByIdUseCase {

    RetrieveRoomByIdOut execute(ID_da_Sala anIn);

}
