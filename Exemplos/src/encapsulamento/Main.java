/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Main {

    public static void main(String args[]) throws Exception {
        Aluno a = new Aluno();
        a.setNome("Joao");

        double notas[] = new double[3];
        for (int i = 0; i < 3; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª nota: "));
        }
        a.setNotas(notas);

        notas = a.getNotas();
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i + 1) + " = " + notas[i]);
        }

        Endereco e = new Endereco();
        e.setRua("Rua X");
        e.setBairro("Bairro B");
        e.setNumero(50);

        a.setEndereco(e);

        //Acessar o nome da rua do aluno
        System.out.println(a.getEndereco().getRua());
        System.out.println(a.getEndereco().getNumero());

        //Acessar o endereço do aluno e atribuir o número
        a.getEndereco().setNumero(60);
        System.out.println(a.getEndereco().getNumero());
    }

}
