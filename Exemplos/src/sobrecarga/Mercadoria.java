package sobrecarga;

/**
 *
 * @author franc
 */
public class Mercadoria {
    private String descricao;
    private double preco;

    public Mercadoria () {}
    
    public Mercadoria (double preco) {
        this.preco = preco;
    }
    
    public Mercadoria (String descricao) {
        this.descricao = descricao;
    }
    
    public Mercadoria(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setDesconto(double desconto) {
        this.preco = this.preco - desconto;
    }   
    
    public void setDesconto(int porcentagem) {
        this.preco = this.preco - (this.preco * (porcentagem / 100.0));   
    }
}
