package br.unifei.imc.pagamento;

import java.util.List;

import br.unifei.imc.produto.Produto;

public class Boleto implements Pagamento{
    private double totalPrice;

    @Override
    public double calcularPreco(List<Produto> produtos) {
        produtos.forEach(product -> totalPrice += product.getPreco());
        
        return totalPrice * 0.9;
    }
    
}
