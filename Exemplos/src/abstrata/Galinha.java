/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Galinha extends Animal {

    public int quantidadeOvos;

    public Galinha() {
    }

    public Galinha(int quantidadeOvos, float peso, String nome, String especie) {
        super(peso, nome, especie);
        this.quantidadeOvos = quantidadeOvos;
    }

    public int getQuantidadeOvos() {
        return quantidadeOvos;
    }

    public void setQuantidadeOvos(int quantidadeOvos) {
        this.quantidadeOvos = quantidadeOvos;
    }

    @Override
    public void emitirSom() {
        System.out.println("COCORICÓ");
    }

    @Override
    public void emitirSom(int volumeSom) {
        if (volumeSom < 10) {
            System.out.println("cócó");
        } else {
            System.out.println("COCORICÓOOOO");
        }
    }
}
