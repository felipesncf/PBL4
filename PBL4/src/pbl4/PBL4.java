/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl4;

import javax.swing.JOptionPane;

/**
 *

 * @author pioca_000
 */
public class PBL4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto paozinho= new Paozinho(6, 5, "saboroso", "salgado");
        Produto doce= new Doce(5, 3, "muito bom", "gourmet");
        Produto frios= new Frios(8, 2, "gostoso");
        Pedido pedido = new Pedido();
        
        pedido.fazerPedido(paozinho);
        pedido.fazerPedido(doce);
        pedido.fazerPedido(frios);
        
        
        String dia_da_semana=JOptionPane.showInputDialog("Qual o dia da compra?");
        
        System.out.println("O tempo de entrega do paozinho eh: "+ paozinho.tempo(dia_da_semana));
        System.out.println("");
        
        System.out.println("O tempo de entrega do doce eh: "+ doce.tempo(dia_da_semana));
        System.out.println("");
        
        System.out.println("O tempo de entrega do frio eh: "+ frios.tempo(dia_da_semana));
        System.out.println("");
        
        System.out.println("O total da compra foi: "+ pedido.valorTotal());
        System.out.println("");
        
        System.out.println("A quantidade de paezinhos foi: "+ pedido.quantidadePaozinho());
        System.out.println("");
        
        System.out.println("A quantidade de doce foi: "+ pedido.quantidadeDoce());
        System.out.println("");
        
        System.out.println("A quantidade de frios foi: "+ pedido.quantidadeFrios());
        System.out.println("");
        
        System.out.println("O tempo total de entrega eh de: "+ pedido.tempoEntrega());
        
        
    }
    
}
