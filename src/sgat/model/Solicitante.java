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
public class Solicitante extends Usuario{
    
    private Unidade unidade;
    
    public Solicitante(String nome, int ramal, Unidade unidade) {
        super(nome, ramal);
        this.unidade = unidade;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
}
