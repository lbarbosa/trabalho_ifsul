/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomesobrenome;

/**
 *
 * @author lbarbosa
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public String toString(){
        String msg = nome + " " + sobrenome + ": " + idade ;
        return msg;    
    }
    
    public String toStringFile(){
        String msg = nome + "#" + sobrenome + "#" + idade ;
        return msg;    
    }    
    
}
