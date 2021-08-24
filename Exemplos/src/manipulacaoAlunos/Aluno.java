package manipulacaoAlunos;

/**
 *
 * @author franc
 */
public class Aluno {
    //Atributos
    String nome;
    int matricula;
    double notas[] = new double[3]; //Vetor de 3 posições do tipo double
    
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
}
