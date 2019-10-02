package diagramaPedido;

import java.util.Calendar;
//import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(1,"Vinicius","viniciusmlippel@gmail.com");
		Vendedor vendedor = new Vendedor(1,"José");
		Produto produto = new Produto(1,"Bicicleta",2550, 2);
		Produto produto1 = new Produto(2, "Mouse", 30.50, 5);
		Produto produto2 = new Produto(3, "Mesa", 499, 1);
		Date dtInicio = new Date();
		Pedido pedido = new Pedido(dtInicio, 1, vendedor, cliente);
//		Thread.sleep(3000);
		pedido.addProduto(produto);
//		Thread.sleep(3000);
		pedido.addProduto(produto1);
		pedido.addProduto(produto1);
		pedido.addProduto(produto2);
		Date dtFim = new Date();
		pedido.finalizarPedido(dtFim);
		System.out.println(pedido);
		System.out.println(pedido.verificaProdutoUnico(produto1));
		System.out.println(pedido.totalPedido());
		System.out.println(pedido.valorMedio());
		System.out.println(pedido.quantidadeMaior(2));
		System.out.println(pedido.nomeVendedor());
		System.out.println(pedido.emailCliente());
		System.out.println(pedido.buscaProdutoDescricao("m"));
		System.out.println(pedido.dias());
	}

}
