package Presidente_CU.repositorio;

import Presidente_CU.entidade.Sala;
import Presidente_CU.objetos_de_valor.identificador.ID_da_Sala;

public interface Repositorio_Sala {

    Sala salva(Sala aSala);

    void deleta(ID_da_Sala anId);

    Sala getById(ID_da_Sala anId);

    Sala getByLink(String aLink);
}
