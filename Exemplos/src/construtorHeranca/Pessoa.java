/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtorHeranca;

/**
 *
 * @author franc
 */
public class Pessoa {
    protected String nome;
    private String cpf;
    private int codigo;
    private Endereco endereco;
    private boolean isAtivo;
    
    public Pessoa () {}
    
    //Método construtor
    public Pessoa (String nome, String cpf, int codigo, Endereco endereco, boolean isAtivo) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
        this.endereco = endereco;
        this.isAtivo = isAtivo;
    }
    
    public Pessoa (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    } 

    public boolean isIsAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(boolean isAtivo) {
        this.isAtivo = isAtivo;
    }
    
    
}
