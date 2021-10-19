/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoes;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class ExemploExcecao {

    public static void main(String args[]) {
        int numero1 = 0;
        int numero2 = 0;
        double divisao = 1;
        
        try {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
            divisao = numero1 / numero2;
        } catch (NumberFormatException exception) {
            System.out.println("exceção disparada" + exception);
            JOptionPane.showMessageDialog(null, "Valor digitado inválido!");
            return;
        } catch (ArithmeticException ex) {
            divisao = 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro não identificado\n" + e.getMessage());
        }

        JOptionPane.showMessageDialog(null, numero1 + " / " + numero2 + " = "
                + divisao);
    }
}
