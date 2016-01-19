package br.com.datarey.dao.fis;

import br.com.datarey.dao.IdentificadorDao;
import br.com.datarey.dao.IdentificadorDaoImpl;
import br.com.datarey.model.fis.NCM;

/**
 * Created by henrique.luiz on 19/01/2016.
 */
public class NCMDaoImpl extends IdentificadorDaoImpl<NCM> implements NCMDao{

    @Override
    protected NCM beforeInsert(NCM entity) {
        return entity;
    }
}
