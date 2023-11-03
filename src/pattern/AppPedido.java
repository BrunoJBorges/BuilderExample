package pattern;

import builder.PedidoBuilder;
import domain.Pedido;

public class AppPedido {

	public static void main(String[] args) {
		Pedido pedido = new PedidoBuilder()
				.setNumero(10)
				.setCliente("Joao")
				.setProduto("PC", 2)
				.setProduto("Celular", 3)
				.builder();
		
		System.out.print(pedido);

	}
	
}