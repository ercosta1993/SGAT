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
public class Hardware extends Produto{
    private TipoHardware tipoHardware;

    public Hardware(TipoHardware tipoHardware, String nome, int quantidade, TipoUso tipoUso, String patrimonioAssociado, SistemaOperacional sistemaOperacional, String link) {
        super(nome, quantidade, tipoUso, patrimonioAssociado, sistemaOperacional, link);
        this.tipoHardware = tipoHardware;
    }

    public TipoHardware getTipoHardware() {
        return tipoHardware;
    }

    public void setTipoHardware(TipoHardware tipoHardware) {
        this.tipoHardware = tipoHardware;
    }

   
}
