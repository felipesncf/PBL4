/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl4;

import java.util.ArrayList;

/**
 *
 * @author pioca_000
 */
public class Pedido {
    private ArrayList<Produto> produtos;
    private String dia;
    
    public Pedido(){
        this.produtos= new ArrayList<>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
    public double valorTotal(){
        double valorCompra=0;
        for(int i=0;i<produtos.size();i++){
            valorCompra+=produtos.get(i).preco;
        }
        return valorCompra;
    }
    
    public int quantidadePaozinho(){
        
        int totalPaozinho=0;
        for(int i=0;i<this.produtos.size();i++){
            if (this.produtos.get(i) instanceof Paozinho){
                totalPaozinho++;
            }
        }
        return totalPaozinho;
    }
    
    public int quantidadeDoce(){
        
        int totalDoce=0;
        for(int i=0;i<this.produtos.size();i++){
            if (this.produtos.get(i) instanceof Doce){
                totalDoce++;
            }
        }
        return totalDoce;
    }
    
    public int quantidadeFrios(){
        
        int totalFrios=0;
        for(int i=0;i<this.produtos.size();i++){
            if (this.produtos.get(i) instanceof Frios){
                totalFrios++;
            }
        }
        return totalFrios;
    }
    
    
    public double tempoEntrega(){
        double tempoTotal=0;
        
        for(int i=0;i<this.produtos.size();i++){
            tempoTotal+=this.produtos.get(i).tempo;
        }
        return tempoTotal;
    }
    
    
    public void fazerPedido(Produto produto){
        this.produtos.add(produto);
    }
}
