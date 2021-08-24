package manipulacaoAlunos;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Main {

    public static void main(String args[]) {
        //Declaração de objetos de uma classe
        Aluno aluno1; //aluno1 é uma variável do tipo aluno
        Aluno aluno2, aluno3;

        //Instanciar um objeto da classe = new
        aluno1 = new Aluno(); //aluno1 é um objeto da classe Aluno

        //Acesso os atributos e métodos de uma classe através do objeto = . (ponto) ~> objeto.atributo
        aluno1.nome = "José";
        aluno1.matricula = 123456;
        for (int i = 0; i < 3; i++) {
            aluno1.notas[i] = 20;
        }

        //Chamando o método para o aluno1
        aluno1.receberPontoExtra(2);

        //Interação com o usuário para solicitar os dados do aluno2
        //Instanciar o objeto
        String dado;
        aluno2 = new Aluno();
        dado = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        aluno2.nome = dado;
        dado = JOptionPane.showInputDialog("Digite a matrícula do aluno: ");
        aluno2.matricula = Integer.parseInt(dado);
        for (int i = 0; i < 3; i++) {
            dado = JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª nota do aluno: ");
            aluno2.notas[i] = Double.parseDouble(dado);
        }

        JOptionPane.showMessageDialog(null, aluno1.nome + " está " + (aluno1.isAprovado() ? "aprovado" : "reprovado"));
        JOptionPane.showMessageDialog(null, aluno2.nome + " está " + (aluno2.isAprovado() ? "aprovado" : "reprovado"));

    }
}
