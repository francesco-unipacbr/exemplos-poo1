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
public abstract class Animal {
    private float peso;
    private String nome;
    private String especie;

    public Animal() {}
    
    public Animal(float peso, String nome, String especie) {
        this.peso = peso;
        this.nome = nome;
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
   
    
    public abstract void emitirSom();
    public abstract void emitirSom(int volumeSom);
}
