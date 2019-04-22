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
public class Frios extends Produto{

    public Frios(double preco, int validade, String especificacao) {
        super(preco, validade, especificacao);
        this.tempo=6;
    }
    
    
    
    
    public double tempo(String dia){
        double tempoatuAlizado=this.tempo;
        if(dia.equals("domingo")){
            this.tempo=this.tempo*1.1;
        }
        return this.tempo;
    }
    
    
}
