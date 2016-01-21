package br.com.datarey.app.fis;

import br.com.datarey.app.BaseReportImpl;
import br.com.datarey.dao.fis.NCMDao;

/**
 * Created by henrique.luiz on 20/01/2016.
 */
public class NCMReportImpl extends BaseReportImpl<NCMDao> implements NCMReport{


    public NCMReportImpl() {
        super("br/com/datarey/app/fis/NCM-report");
    }
}
