package br.unifei.imc.pagamento;

import java.util.List;

import br.unifei.imc.produto.Produto;

public class CartaoCredito implements Pagamento{
    private double totalPrice;
    @Override
    public double calcularPreco(List<Produto> produtos) {
        produtos.forEach(produto -> totalPrice += produto.getPreco()); 
       
        return totalPrice * 1.02;
    }  
}
