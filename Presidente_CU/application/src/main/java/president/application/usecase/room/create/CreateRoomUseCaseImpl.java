package president.application.usecase.room.create;

import president.domain.entidade.Jogador;
import president.domain.entidade.Sala;
import president.domain.repositorio.Repositorio_Sala;
import president.domain.objetos_de_valor.Configuracao_de_Acesso;

public class CreateRoomUseCaseImpl implements CreateRoomUseCase {

    final Repositorio_Sala repositorio ;

    public CreateRoomUseCaseImpl(Repositorio_Sala repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public CreateRoomOut execute(CreateRoomIn anIn) {
        return CreateRoomOut.of(
            repositorio.salva(anIn.toRoom())
        );
    }

}
