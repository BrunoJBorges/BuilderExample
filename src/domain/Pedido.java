package domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numeroPedido;
    private Cliente cliente;
    private List<Produto> produtos;

    // Construtor
    public Pedido() {
        produtos = new ArrayList<Produto>();
    }
    
    public int getTotalProdutos() {
    	int total = 0;
    	for (Produto produto : produtos) {
    		total += produto.getQuantidade();
    	}
    	
    	return total;
    }
    
    public void addProduto(Produto produto) {
    	produtos.add(produto);
    }
    
    // Método para obter o número do pedido
    public int getNumeroPedido() {
        return numeroPedido;
    }

    // Método para definir o número do pedido
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    // Método para obter o cliente associado ao pedido
    public Cliente getCliente() {
        return cliente;
    }

    // Método para definir o cliente associado ao pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método para obter o produto associado ao pedido
    public List<Produto> getProduto() {
        return produtos;
    }

    // Método para definir o produto associado ao pedido
    public void setProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public String toString() {
    	StringBuffer detalhes = new StringBuffer();
    	detalhes.append("#############################\n");
    	detalhes.append("Pedido N: "+ numeroPedido + "\n");
    	detalhes.append("#############################\n");
    	detalhes.append(cliente + "\n");
    	for (Produto produto : produtos) {
    		detalhes.append(produto +"\n");
    	}
    	detalhes.append("Quantidade de produtos: "+ getTotalProdutos() +"\n");
    	
    	return detalhes.toString();
    }
   
}