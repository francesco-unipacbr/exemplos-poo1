/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author franc
 */
public class Medicamento extends Mercadoria {
    private double dosagem;
    private Color tarja;
    private Date dataValidade;

    public Medicamento(String descricao, double preco, double dosagem, Color tarja, Date dataValidade) {
        super(descricao, preco);
        this.dosagem = dosagem;
        this.tarja = tarja;
        this.dataValidade = dataValidade;
    }    
    
    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

    public Color getTarja() {
        return tarja;
    }

    public void setTarja(Color tarja) {
        this.tarja = tarja;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }    
    
    public String getDataValidadeFormatada() {      
        String dia = (dataValidade.getDate() < 10 ? "0" : "") + dataValidade.getDate();
        String mes = ((dataValidade.getMonth() + 1) < 10 ? "0" : "") + (dataValidade.getMonth() + 1);
        return dia + "/" + mes + "/" + dataValidade.getYear();
    }
}
