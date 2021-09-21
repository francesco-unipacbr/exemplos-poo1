/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author franc
 */
public class Main {
    public static void main (String args[]) {
        
        Mercadoria arroz = new Mercadoria(30.0);
        arroz.setDesconto(10);
        System.out.println(arroz.getPreco());
        //arroz.setDesconto(0.9f);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String strPreco = df.format(arroz.getPreco()).replace(',', '.');
        System.out.println(strPreco);
       double novoPreco = Double.parseDouble(strPreco);
       System.out.println(novoPreco);

       Date dataValidade = new Date(2022, 9, 15);
       Medicamento dipirona = new Medicamento("Dipirona", 9.9, 5, Color.yellow, dataValidade);
       System.out.println(dipirona.getDataValidade());
       System.out.println(dipirona.getDataValidadeFormatada());

       Mercadoria m[] = new Mercadoria[5];
       m[0] = new Medicamento(strPreco, novoPreco, novoPreco, Color.gray, dataValidade);
       if (m[0] instanceof Medicamento) {
           System.out.println("é um medicamento");
       }
    }
}
