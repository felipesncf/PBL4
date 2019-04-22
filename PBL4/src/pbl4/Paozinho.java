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
public class Paozinho extends Produto{
    private String sabor;

    public Paozinho(double preco, int validade, String especificacao, String sabor) {
        super(preco, validade, especificacao);
        this.tempo=2;
        this.sabor=sabor;
    }
    
    
    
    public String getSabor(){
        return sabor;
    }
    public void setSabor(String sabor){
        this.sabor=sabor;
    }
    
    public double tempo(String dia){
        if(dia.equals("sabado") || dia.equals("domingo")){
            this.tempo=this.tempo*1.15;
        }
        return this.tempo;
    }
}
