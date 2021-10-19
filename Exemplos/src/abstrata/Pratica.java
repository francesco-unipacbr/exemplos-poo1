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
public class Pratica extends Disciplina {
    private float quantidadeHoras;
    private int numeroLaboratorio;

    public Pratica(String nome, int periodo, float[] notas, float quantidadeHoras, int numeroLaboratorio) {
        super(nome, periodo, notas);
        this.quantidadeHoras = quantidadeHoras;
        this.numeroLaboratorio = numeroLaboratorio;
    }
    
    public Pratica() {}

    public float getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(float quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public int getNumeroLaboratorio() {
        return numeroLaboratorio;
    }

    public void setNumeroLaboratorio(int numeroLaboratorio) {
        this.numeroLaboratorio = numeroLaboratorio;
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
