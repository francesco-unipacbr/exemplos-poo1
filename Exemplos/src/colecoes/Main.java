/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.*;
/**
 *
 * @author franc
 */
public class Main {
    public static void main (String args[]) {
//        //Declaração de uma coleção de String
//       ArrayList<String> nomes = new ArrayList();
//       
//       //Inserção de elementos na coleção = add
//       nomes.add("João");
//       nomes.add("Maria");
//       nomes.add("José");
//       nomes.add("João");
//       
//       //Remoção de um elemento da coleção = remove(elemento)
//       nomes.remove("Maria");
//       
//       //Contains = verifica se um determinado elemento existe na lista
//       if (nomes.contains("João")) {
//           System.out.println("Existe João na lista");
//       }
//       
//       if (!nomes.contains("Zé")) {
//           System.out.println("Não existe Zé na lista");
//       }
//       
//       System.out.println(nomes);
//       
//        //Percorrer a lista
//        nomes.forEach((n) -> {
//            System.out.println("Nome = " + n);
//        });
//        
//        System.out.println("\n\n===============");
//        for (String n: nomes) {
//           System.out.println("Nome = " + n);
//        }
//        
//        
//        ArrayList<Funcionario> lstFuncionarios = new ArrayList();
//        Funcionario joao = new Funcionario("Joao", 123456, 1500);
//        lstFuncionarios.add(joao);
//        Funcionario maria = new Funcionario("Maria", 56789, 1750.99);
//        lstFuncionarios.add(maria);
//        
//        System.out.println("\n\n\n");
//        double totalSalario = 0;
//        //Percorrer a coleção: Sintaxe Classe <variavel> : lista a ser percorrida
//        for (Funcionario f: lstFuncionarios) {
//            System.out.println("Nome: " + f.getNome() + "\nRegistro: " + f.getRegistro() + 
//                    "\nSalário: R$" + f.getSalario() + "\n============\n");
//            totalSalario += f.getSalario();
//        }
//        
//        System.out.println("\nTOTAL SALÁRIOS = " + totalSalario);
//        
        CadastroFuncionarios c = new CadastroFuncionarios();
        c.setVisible(true);
    }
}
