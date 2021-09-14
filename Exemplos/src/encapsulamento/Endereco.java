package encapsulamento;

/**
 *
 * @author franc
 */
public class Endereco {
    private String rua, bairro;
    private int numero;
    
    //get e setRua
    public String getRua () {
        return rua;
    }
    
    public void setRua (String rua) {
        this.rua = rua; //O meu atributo rua (caracterizado pelo "this") recebe o valor da variável rua passado por parâmetro
    }
    
    public String getBairro () {
        return bairro;
    }
    
    public void setBairro (String bairro) {
        this.bairro = bairro;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
 }
