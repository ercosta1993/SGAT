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
public class Avaliacao {
    private int trace;
    private int ano;
    private boolean projeto;
    private String responsavel;
    private Solicitante solicitante;
    private Recomendacao recomendacao;
    private String motivo;

    public Avaliacao(int trace, int ano, boolean projeto, String responsavel, Solicitante solicitante, Recomendacao recomendacao, String motivo) {
        this.trace = trace;
        this.ano = ano;
        this.projeto = projeto;
        this.responsavel = responsavel;
        this.solicitante = solicitante;
        this.recomendacao = recomendacao;
        this.motivo = motivo;
    }

    public int getTrace() {
        return trace;
    }

    public void setTrace(int trace) {
        this.trace = trace;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isProjeto() {
        return projeto;
    }

    public void setProjeto(boolean projeto) {
        this.projeto = projeto;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Recomendacao getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(Recomendacao recomendacao) {
        this.recomendacao = recomendacao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
