package president.application.usecase.room.create;

import president.domain.entidade.Jogador;
import president.domain.entidade.Sala;
import president.domain.objetos_de_valor.Configuracao_de_Acesso;

public record CreateRoomIn(
        String nickName,
        Configuracao_de_Acesso.Visibility visibility,
        int maxPlayers) {


    public Sala toRoom() {
        return Sala.of(
                Jogador.of(nickName),
                Configuracao_de_Acesso.of(maxPlayers, visibility)
        );
    }

    // public CreateRoomOut execute(CreateRoomUseCaseImpl createRoomUseCaseImpl) {
    
    //     return CreateRoomOut.of(
    //             createRoomUseCaseImpl.repository.salva(toRoom())
    //     );
    
    // }

}
