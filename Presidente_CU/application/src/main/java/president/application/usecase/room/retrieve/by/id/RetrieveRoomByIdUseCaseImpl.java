package president.application.usecase.room.retrieve.by.id;

import president.domain.repositorio.Repositorio_Sala;
import president.domain.objetos_de_valor.identificador.ID_da_Sala;

public class RetrieveRoomByIdUseCaseImpl implements RetrieveRoomByIdUseCase {

    private final Repositorio_Sala repositorio;

    public RetrieveRoomByIdUseCaseImpl(Repositorio_Sala repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public RetrieveRoomByIdOut execute(ID_da_Sala anIn) {

        return RetrieveRoomByIdOut.of(
                repositorio.getById(anIn)
        );

    }

}
