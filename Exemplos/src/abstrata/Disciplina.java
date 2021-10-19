/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

/**
 *
 * @author franc
 */

/* Classe abstrata = tipo específico de classe
que não permite criar instâncias.
Serve como modelo específico para gerar filhas
com comportamentos pré determinados.
Uma classe se torna abstrata ao utilizar a palavra
reservada "abstract" na sua declaração 
*/
public abstract class Disciplina {
    private String nome;
    private int periodo;
    private float[] notas = new float[3];

    public Disciplina () {}
    
    public Disciplina(String nome, int periodo, float[] notas) {
        this.nome = nome;
        this.periodo = periodo;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    
    /*Métodos abstratos
    Os métodos abstratos servem para obrigar o desenvolvedor
    a reescrever esses métodos nas classes filhas.
    Geralmente determinados através de regra de negócio.
    Não é necessário escrever o método na classe mãe, apenas
    declará-lo.
    */
    public abstract float calculaNotaFinal();
    
    
    
}
