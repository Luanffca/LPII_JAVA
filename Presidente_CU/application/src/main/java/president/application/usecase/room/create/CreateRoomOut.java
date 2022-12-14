package president.application.usecase.room.create;

import president.domain.entidade.Sala;

public record CreateRoomOut(String roomId, String link, String status) {

    static CreateRoomOut of(Sala umSala) {
        return new CreateRoomOut(
            umSala.getID_da_Sala().getValor(),
            umSala.getLink_da_Sala().getValor(),
            umSala.getStatus().name()
        );
    }
}
