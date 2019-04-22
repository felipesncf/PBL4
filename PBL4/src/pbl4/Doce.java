/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl4;

/**
 *
 * @author pioca_000
 */
public class Doce extends Produto{
    private String tipo;

    public Doce(double preco, int validade, String especificacao, String tipo) {
        super(preco, validade, especificacao);
        this.tempo=5;
        this.tipo=tipo;
    }
    
    
    
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public double tempo(String dia){
        if(dia.equals("sabado") || dia.equals("domingo")){
            this.tempo=this.tempo*1.2;
        }
        return this.tempo;
    }
}
