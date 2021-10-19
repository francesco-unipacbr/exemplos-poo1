/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

/**
 *
 * @author franc
 */
public class MainAnimal {
    public static void main (String args[]) {
        //Animal a = new Animal();
        Cachorro c = new Cachorro();
        c.emitirSom(18);
        
        Galinha g = new Galinha();
        g.emitirSom();
    }
}
