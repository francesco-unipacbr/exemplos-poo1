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
public class Cachorro extends Animal {
    private int tempoGestacao;

    public Cachorro() {  }

    public Cachorro(int tempoGestacao, float peso, String nome, String especie) {
        super(peso, nome, especie);
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
    
    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "AU AU");
    }    
    
    @Override
    public void emitirSom(int volumeSom) {
        if (volumeSom < 10) {
            JOptionPane.showMessageDialog(null, "au");
        }
        else {
            JOptionPane.showMessageDialog(null, "AAAAUUUU AAUUUUU");
        }
    }
}
