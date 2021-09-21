/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarInstancia;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Main {

    public static void main(String args[]) {
        //Mamifero mamiferos[] = new Mamifero[5];
        Animal animais[] = new Animal[5];

        for (int i = 0; i < 5; i++) {
            int tipo = Integer.parseInt(JOptionPane.showInputDialog("*****CADASTRO DE ANIMAIS****\nTipo:\n1 - Mamífero\n2 - Réptil"));

            String descricao = JOptionPane.showInputDialog("Descrição: ");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
            if (tipo == 1) {
                String anatomia = JOptionPane.showInputDialog("Anatomia: ");
                animais[i] = new Mamifero(descricao, peso, anatomia);
            } else {
                int isVenenoso = Integer.parseInt(JOptionPane.showInputDialog("É venenoso?\n1 - SIM\n2 - NÃO"));
                int hasEscamas = Integer.parseInt(JOptionPane.showInputDialog("Tem escamas?\n1 - SIM\n2 - NÃO"));
                animais[i] = new Reptil(descricao, peso, hasEscamas == 1, isVenenoso == 1);
            }

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        }

        for (int i = 0; i < 5; i++) {
            //instanceof = valida o tipo da instância do objeto
            if (animais[i] instanceof Mamifero) {
                Mamifero m = (Mamifero) animais[i];
                System.out.println(m.todosOsDados());
            } else if (animais[i] instanceof Reptil) {
                Reptil r = (Reptil) animais[i];             
                System.out.println(r.todosOsDados());
            } else {
                System.out.println("Não é possível imprimir");
            }
        }

    }
}
