package japplet;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author franc
 */
public class Desenho extends JApplet {
    
    int raio;
    Image imagem;
        
    public void init () {
        setSize(1000,500);
        raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio a ser desenhado"));
        imagem = getImage(getCodeBase(), "unipac.png"); //Pega o arquivo de imagem na pasta build/classes/ 
    }
    
    public void paint (Graphics g) {
        Color c; //Declaração da variável;;
        c = new Color(55,55,55); //Instância do objeto
        
        g.setColor(c); //Gerar cores em RGB
        g.fillOval(10, 10, 50, 50);
        g.setColor(Color.MAGENTA);
        g.fillOval(20, 20, 30, 30);
        g.drawRect(15, 20, 50, 5);        
        g.drawOval(50, 50, raio++, raio++);      
        
        int x[] = { 20, 40, 50, 30,20, 15};
        int y[]= {50, 50, 60, 80, 80, 60};
        Polygon p = new Polygon(x, y, 6);
        g.setColor(Color.BLUE);
        g.fillPolygon(p);
        
        g.drawImage(imagem, 0, 0, this);
    }
    
}
