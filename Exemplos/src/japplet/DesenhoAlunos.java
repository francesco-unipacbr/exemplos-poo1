/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japplet;

/**
 *
 * @author franc
 */

    import javax.swing.*;
import java.awt.*;

public class DesenhoAlunos extends JApplet {
    
    @Override
    public void paint (Graphics g) {
        Color meuVerde = new Color(153, 204, 50);
        setSize(960, 720);
        g.setColor(meuVerde);
        g.fill3DRect(100, 50, 480, 576, true);
       // g.drawRect(100, 50, 480, 576);
        g.setColor(Color.BLACK);
        g.drawRect(230, 140, 140, 140); //Socket
        for (int j = 0; j < 140; j = j + 5){     //Pinos Socket
            for (int k = 0; k < 140; k = k + 5){
               g.drawRect(231 + j, 141 + k, 5, 5); 
            }
        }    
        g.drawRect(210, 280, 160, 4);
        g.fill3DRect(370, 140, 15, 145, true);
        //g.drawOval(200, 100, g.fill3DRect(260, 185, 40, 40, true);190, 190); // socket
        g.drawRect(450, 75, 10, 250);
        g.drawRect(465, 75, 10, 250);
        g.drawRect(480, 75, 10, 250);
        g.drawRect(495, 75, 10, 250);
        g.drawRect(150, 410, 200, 25);
        //g.drawRect(155, 420, 185, 1);
        g.drawRect(150, 460, 200, 25);
        g.drawRect(150, 510, 200, 25);
        g.drawRect(150, 560, 200, 25);
        g.drawRect(225, 350, 150, 30); //M.2
        g.drawRect(340, 354, 30, 22);
        g.drawOval(420, 340, 50, 50); // bateria
        g.fill3DRect(465, 350, 10, 30, true);
        
        //g.fill3DRect(400, 400, 150, 190, true);
        g.setColor(Color.GRAY);
        g.fill3DRect(400, 400, 150, 190, true);
        g.fill3DRect(405, 405, 140, 180, true);// Dissipador chipset

        //g.drawRect(400, 400, 150, 190);// Dissipador chipset
        g.setColor(Color.BLACK);
        g.drawOval(212, 360, 12, 12); //parafuso
        g.drawLine(215, 360, 220, 370);
        //g.drawLine(216, 361, 224, 354);
        g.drawRect(150, 70, 60, 30); //atx 8
        g.drawRect(400, 70, 15, 25); //cpu_fan
        g.drawRect(530, 220, 31, 150);
        g.drawRect(140, 600, 30, 15);
        g.drawRect(240, 600, 30, 15);
        g.drawRect(480, 600, 40, 15);
        // furações:
        g.drawOval(110, 600, 15, 15);
        g.drawOval(110, 58, 15, 15);
        g.drawOval(555, 58, 15, 15);
        g.drawOval(555, 600, 15, 15);
        g.drawOval(110, 400, 15, 15);
        
        // pinos ATX
        for (int i = 0; i < 26; i = i + 5){
            for (int b = 0; b < 150; b = b + 5){
               g.drawRect(531 + i, 220 + b, 5, 5); 
            }
        }
        g.drawString("MSI", 300, 400);
        
        // VRM
        g.drawRect(150, 240, 25, 25);
        g.drawRect(150, 210, 25, 25);
        g.drawRect(150, 180, 25, 25);
        g.drawRect(150, 150, 25, 25);
        g.drawRect(145, 240, 25, 25);
        g.drawRect(145, 210, 25, 25);
        g.drawRect(145, 180, 25, 25);
        g.drawRect(145, 150, 25, 25);
        //MOSFET
        g.drawRect(160, 240, 5, 25);
        g.drawRect(160, 210, 5, 25);
        g.drawRect(160, 180, 5, 25);
        g.drawRect(160, 150, 5, 25);
        
        // SATA
         g.drawRect(556, 545, 17, 40);
         g.drawRect(567, 548, 1, 33);
         g.drawRect(556, 500, 17, 40);
         g.drawRect(567, 503, 1, 33);
         g.drawRect(556, 455, 17, 40);
         g.drawRect(567, 458, 1, 33);
         g.drawRect(556, 410, 17, 40);
         g.drawRect(567, 413, 1, 33);
         g.drawRect(560, 100, 15, 25);
         g.drawRect(560, 145, 15, 25);
        }
}
