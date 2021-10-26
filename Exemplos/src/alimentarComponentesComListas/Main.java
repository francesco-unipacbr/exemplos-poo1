/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentarComponentesComListas;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Main {
    public static ArrayList<Aluno> lstAlunos = new ArrayList();
    public static void main(String args[]) {
       
        
        lstAlunos.add(new Aluno("Joao", 123));
        lstAlunos.add(new Aluno("Maria", 456));
        lstAlunos.add(new Aluno("Ze", 789));
        lstAlunos.add(new Aluno("Marta", 111));
        
        SelecionarAluno s = new SelecionarAluno();
        s.setVisible(true);
    }
}
