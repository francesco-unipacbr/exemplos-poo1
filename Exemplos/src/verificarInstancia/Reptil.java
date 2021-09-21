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
public class Reptil extends Animal {

    private boolean hasEscamas;
    private boolean isVenenoso;

    public Reptil() {
    }

    public Reptil(boolean hasEscamas, boolean isVenenoso, Color cor, int numeroPatas, double peso, double altura, String habitat, String descricao) {
        super(cor, numeroPatas, peso, altura, habitat, descricao);
        this.hasEscamas = hasEscamas;
        this.isVenenoso = isVenenoso;
    }

    public Reptil(String descricao, double peso, boolean hasEscamas, boolean isVenenoso) {
        super(descricao, peso);
        this.hasEscamas = hasEscamas;
        this.isVenenoso = isVenenoso;
    }

    public boolean hasEscamas() {
        return hasEscamas;
    }

    public void setHasEscamas(boolean hasEscamas) {
        this.hasEscamas = hasEscamas;
    }

    public boolean isVenenoso() {
        return isVenenoso;
    }

    public void setIsVenenoso(boolean isVenenoso) {
        this.isVenenoso = isVenenoso;
    }

    public String todosOsDados() {
        return "Descrição: " + super.getDescricao() + "\nPeso: " + super.getPeso() + " kg"
                + "\nVenenoso? " + (isVenenoso ? "Sim" : "Não")
                + "\nTem escamas? " + (hasEscamas ? "Sim" : "Não");
    }
}
