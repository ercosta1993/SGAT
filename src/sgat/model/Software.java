/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgat.model;

/**
 *
 * @author 20413677
 */
public class Software extends Produto{
    
    private TipoLicenca tipoLicenca;

    public Software(TipoLicenca tipoLicenca, String nome, int quantidade, TipoUso tipoUso, String patrimonioAssociado, SistemaOperacional sistemaOperacional, String link) {
        super(nome, quantidade, tipoUso, patrimonioAssociado, sistemaOperacional, link);
        this.tipoLicenca = tipoLicenca;
    }

    public TipoLicenca getTipoLicenca() {
        return tipoLicenca;
    }

    public void setTipoLicenca(TipoLicenca tipoLicenca) {
        this.tipoLicenca = tipoLicenca;
    }
}
