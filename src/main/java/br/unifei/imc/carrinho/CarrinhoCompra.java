package br.unifei.imc.carrinho;

import java.util.ArrayList;
import java.util.List;

import br.unifei.imc.pagamento.Boleto;
import br.unifei.imc.pagamento.Pagamento;
import br.unifei.imc.produto.Produto;

public class CarrinhoCompra {

    List<Produto> products;
    private double totalPrice;
    private Pagamento paymentType;


    public CarrinhoCompra(){
        this.products = new ArrayList<Produto>();
        this.paymentType = new Boleto();
    }

    public void addProduto(Produto product) {
        products.add(product);
    }

    public void calcularPreco(){
        totalPrice = paymentType.calcularPreco(products);
    }

    public double getPrecoTotal(){
        return totalPrice;
    } 
    
    public void setTipoPagamento(Pagamento paymentType){
        this.paymentType = paymentType;
    }

    public Pagamento getTipoPagamento(){
        return paymentType;
    }
}
