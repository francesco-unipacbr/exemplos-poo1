package encapsulamento;

import manipulacaoAlunos.*;

/**
 *
 * @author franc
 */
public class Aluno {
    //Atributos
    private String nome;
    private int matricula;
    private double notas[] = new double[3]; //Vetor de 3 posições do tipo double
    private Endereco endereco;
    
    //Métodos
    public boolean isAprovado() {
        double soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += notas[i]; //soma = soma + notas[i];
        }
        return soma >= 60; //retorna true/false
    }
    
    public void receberPontoExtra(double pontoExtra) {
        for (int i = 0; i < 3; i++) {
            notas[i] += pontoExtra; //cada nota do aluno vai receber o que já existe + o ponto extra
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}
