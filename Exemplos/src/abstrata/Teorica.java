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
public class Teorica extends Disciplina {
    private int numeroSala;

    public Teorica(String nome, int periodo, float[] notas, int numeroSala) {
        super(nome, periodo, notas);
        this.numeroSala = numeroSala;
    }
    
    public Teorica() {}

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
    
    @Override
    public float calculaNotaFinal() {
        float total = 0;
        float[] notas = super.getNotas();
           for (int i = 0; i < 3; i++) {
            total += notas[i];
        }   
        return total;
    }
}
