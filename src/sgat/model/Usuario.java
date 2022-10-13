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
public class Usuario {
    private String nome;
    private int ramal;

    public Usuario(String nome, int ramal) {
        this.nome = nome;
        this.ramal = ramal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
