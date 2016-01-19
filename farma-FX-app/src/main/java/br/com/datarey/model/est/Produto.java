package br.com.datarey.model.est;

import br.com.datarey.model.Identificador;
import br.com.datarey.model.fis.NCM;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Created by henrique.luiz on 19/01/2016.
 */
@Entity
public class Produto extends Identificador{

    @NotNull(message = "O NCM e obrigatorio!")
    @ManyToOne
    @JoinColumn(name="ncm_id")
    private NCM ncm;


    public NCM getNcm() {
        return ncm;
    }

    public void setNcm(NCM ncm) {
        this.ncm = ncm;
    }
}
