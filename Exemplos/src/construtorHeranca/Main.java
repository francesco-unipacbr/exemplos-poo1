/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtorHeranca;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Main {

    public static void main(String args[]) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Jose");
        p1.setCpf("456789");

        Pessoa p2 = new Pessoa("Maria");
        p2.setCodigo(2);
        p2.setCpf("789123");

        String nome = JOptionPane.showInputDialog("Digite o nome:");
        String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        int codigo = 3;

        String rua = JOptionPane.showInputDialog("ENDEREÇO\nRua:");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ENDEREÇO\nNúmero:"));
        String bairro = JOptionPane.showInputDialog("ENDEREÇO\nBairro:");
        Endereco e = new Endereco(rua, bairro, numero);

        Pessoa p3 = new Pessoa(nome, cpf, codigo, e, true);
        JOptionPane.showMessageDialog(null, "PESSOA CADASTRADA COM SUCESSO!\nNome: " + p3.getNome()
                + "\nCpf:" + p3.getCpf()
                + "\nCódigo: " + p3.getCodigo()
                + "\nEndereço: Rua " + p3.getEndereco().getRua() + ", nº " + p3.getEndereco().getNumero()
                + " - Bairro " + p3.getEndereco().getBairro());

        
        
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula: "));
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
        Aluno a = new Aluno(matricula, nota, nome, cpf, 4, e, true);
        Aluno b = new Aluno();
        b.setNome(nome);
        b.setCpf(cpf);
        b.setCodigo(5);
        b.setIsAtivo(false);
        b.setMatricula(matricula);
        b.setNota(nota);
        b.setEndereco(e);
        
        
        if (a.getNota() > 60) {
            System.out.println("Aluno aprovado");
        }
        System.out.println(a.getDados());
        
        
        

        
        
    }
}
