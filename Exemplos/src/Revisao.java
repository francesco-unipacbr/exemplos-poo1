
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Revisao {
    public static void main (String args[]) {
        //Comentário de uma linha
        /*
        Comentário de mais de uma linha
        */
        
        //Declaração de variáveis (tipo nome;)
        int idade;
        char letra; //Armazena um único caracter alfanumérico
        double preco, desconto;
        float x;
        String nome; //Armazena uma cadeia de caracteres (incluindo espaço)
        float notas[] = new float[3]; //Vetor de 3 posições (índice começando em 0)
        int matriz[][] = new int[5][5]; //Matriz 5x5 de inteiros
        int nota = 55;
        double exameEspecial = 61;
        boolean ativo = true;
        int numeroDia = 1;
        
        /*ESTRUTURAS CONDICIONAIS
        if (condição) {
            comandos se condição = true
        }
        */
        if (nota >= 60) {
            System.out.println("Aprovado!");
        }
        else if (exameEspecial >= 60) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        
        
        
        if (numeroDia == 1) {
            System.out.println("Domingo");
        }
        else if (numeroDia == 2) {
            System.out.println("Segunda");
        }
        else if (numeroDia == 3) {
            System.out.println("Terça");
        }
        else if (numeroDia == 4) {
            System.out.println("Quarta");
        }
        else if (numeroDia == 5) {
            System.out.println("Quita");
        }
        
        /*ESTRUTURAS DE REPETIÇÃO
        for = PARA
        for (inicializador; condição; atualizador) { 
            comandos que irão se repetir enquanto a condição for verdadeira
        }
        
        */
        int i;
        for (i = 0; i < 5; i++) { //i++ ~> i = i + 1
            System.out.println("i = " + i);
        }
        
        /*  while = ENQUANTO
        while (condição) {
               comandos que irão se repetir enquanto a condição for verdadeira
           }
        */
        //int i = 0;
        i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
        
        /* do... while FAÇA, ENQUANTO
        do {
           comandos que irão se repetir enquanto a condição for verdadeira
        } while (condição);
        */
        i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
        
        
        //ENTRADA DE DADOS COM JOPTIONPANE
       /* nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");*/
        
        numeroDia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do dia: "));
        
        //switch(condicao) case...
        switch (numeroDia) {
            case 1: JOptionPane.showMessageDialog(null, "Domingo");
            break;
            case 2: JOptionPane.showMessageDialog(null, "Segunda");
            break;
            case 3: JOptionPane.showMessageDialog(null, "Terça");
            break;
            case 4: JOptionPane.showMessageDialog(null, "Quarta");
            break;            
            default: JOptionPane.showMessageDialog(null, "Desconhecido");
        }
    }
}
