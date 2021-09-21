/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarInstancia;

import java.awt.Color;

/**
 *
 * @author franc
 */
public class Mamifero extends Animal {
    private String anatomia;

    public Mamifero() {}
    
    public Mamifero(String anatomia, Color cor, int numeroPatas, double peso, double altura, String habitat, String descricao) {
        super(cor, numeroPatas, peso, altura, habitat, descricao);
        this.anatomia = anatomia;
    }
    
    public Mamifero(String descricao, double peso, String anatomia) {
        super(descricao, peso);
        this.anatomia = anatomia;
    }

    public String getAnatomia() {
        return anatomia;
    }

    public void setAnatomia(String anatomia) {
        this.anatomia = anatomia;
    }
    
    public String todosOsDados() {
        return "Descrição: " + super.getDescricao() + "\nPeso: " + super.getPeso() + " kg" +
                "\nAnatomia: " + anatomia;
    }
}
