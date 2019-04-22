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
public abstract class Produto {
    protected double preco;
    protected int validade;
    protected String especificacao;
    protected double tempo;
    
    public Produto(double preco, int validade, String especificacao){
        this.preco=preco;
        this.validade=validade;
        this.especificacao=especificacao;
    }
    
    
    public abstract  double tempo(String dia);
}
