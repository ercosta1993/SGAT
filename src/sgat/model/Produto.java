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
public class Produto {
    private String nome;
    private int quantidade;
    private TipoUso tipoUso;
    private String patrimonioAssociado;
    private SistemaOperacional sistemaOperacional;
    private String link;

    public Produto(String nome, int quantidade, TipoUso tipoUso, String patrimonioAssociado, SistemaOperacional sistemaOperacional, String link) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipoUso = tipoUso;
        this.patrimonioAssociado = patrimonioAssociado;
        this.sistemaOperacional = sistemaOperacional;
        this.link = link;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public TipoUso getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(TipoUso tipoUso) {
        this.tipoUso = tipoUso;
    }

    public String getPatrimonioAssociado() {
        return patrimonioAssociado;
    }

    public void setPatrimonioAssociado(String patrimonioAssociado) {
        this.patrimonioAssociado = patrimonioAssociado;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(SistemaOperacional sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    
}
