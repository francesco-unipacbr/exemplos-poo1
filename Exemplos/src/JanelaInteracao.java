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
        
      
        /*Janela de confirmação
        Retornos:
        -1 = Quando clica no X
        0 = Sim
        1 = Não
        2 = Cancelar
        */
        int opcao = JOptionPane.showConfirmDialog(null, "Você quer ser rico?");
        System.out.println("Opcao escolhida: " + opcao);
        switch(opcao) {
            case 0: JOptionPane.showMessageDialog(null, "Parabéns, você ganhou R$100.000,00! Agora você é rico.", "RICO!", JOptionPane.WARNING_MESSAGE);
            break;
            case 1: JOptionPane.showMessageDialog(null, "Parabéns, você ganhou R$1,00", "POBRE!", JOptionPane.ERROR_MESSAGE);
            break;
            case 2: JOptionPane.showMessageDialog(null, "Você cancelou");
            break;
            case -1: JOptionPane.showMessageDialog(null, "Você fechou a janela");
        }
        
        
        
    }
}
