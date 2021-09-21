/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarInstancia;

import java.awt.Color;

/**
 *
 * @author franc
 */
public class Animal {

    private Color cor;
    private int numeroPatas;
    private double peso, altura;
    private String habitat, descricao;

    public Animal() {
    }

    public Animal (String descricao, double peso) {
        this.descricao = descricao;
        this.peso = peso;
    }
    
    public Animal(Color cor, int numeroPatas, double peso, double altura, String habitat, String descricao) {
        this.cor = cor;
        this.numeroPatas = numeroPatas;
        this.peso = peso;
        this.altura = altura;
        this.habitat = habitat;
        this.descricao = descricao;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
