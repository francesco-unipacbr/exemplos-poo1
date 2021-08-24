//Importação do pacote javax para utilização das janelas de interação JOptionPane
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class JanelaInteracao {
    //Atributos
    int valor;
    
    //Métodos
    public static int dobro (int numero) {
        return numero * 2;
    }
    
    public static void main (String[] args) {
        
        //Janela de mensagem
        //JOptionPane.showMessageDialog(null, "Seja bem-vindo ao meu algoritmo! \\o/");
        
        //Janela de entrada de dados
        String entrada = JOptionPane.showInputDialog("Digite um número: ");
       
        //Método de conversão para inteiro
        int valor = Integer.parseInt(entrada);
        JOptionPane.showMessageDialog(null, valor > 3 ? valor + " é maior que 3" : valor + " é menor que 3");
        int dobroValor = dobro(valor);
        JOptionPane.showMessageDialog(null, "O dobro de " + valor + " é " + dobroValor);
        
    }
}
