package builder;

import domain.Cliente;
import domain.Pedido;
import domain.Produto;

public class PedidoBuilder {
	private Pedido pedido;
	
	public PedidoBuilder() {
		this.pedido = new Pedido();
	}
	
	public PedidoBuilder setNumero(int numero) {
		this.pedido.setNumeroPedido(numero);
		return this;
	}
	
	public PedidoBuilder setCliente(String nome) {
		this.pedido.setCliente(new Cliente(nome));
		return this;
	}
	
	public PedidoBuilder setProduto(String nome, int quantidade) {
		this.pedido.addProduto(new Produto(nome, quantidade));
		return this;
	}
	
	public Pedido builder() {
		return pedido;
	}
	
}