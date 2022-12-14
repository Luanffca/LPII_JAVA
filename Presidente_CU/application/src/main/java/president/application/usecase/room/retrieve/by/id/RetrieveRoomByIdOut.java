package president.application.usecase.room.retrieve.by.id;

import president.domain.entidade.Sala;
import president.domain.objetos_de_valor.Configuracao_de_Acesso;

public record RetrieveRoomByIdOut(String link, String status, Configuracao_de_Acesso.Visibility visibility) {

    static RetrieveRoomByIdOut of(Sala aSala) {
        return new RetrieveRoomByIdOut(
            aSala.getLink_da_Sala().getValor(),
            aSala.getStatus().name(),
            aSala.getConfiguracao_de_Acesso().getVisibilidade()
        );
    }

}
