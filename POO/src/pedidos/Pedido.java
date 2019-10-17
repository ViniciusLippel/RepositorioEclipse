package pedidos;

import java.util.ArrayList;

public class Pedido {
	
	private int codigo;
	private Vendedor vendedor;
	private Cliente cliente;
	private ArrayList<Produto> listaProdutos;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void addProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [codigo=");
		builder.append(codigo);
		builder.append(", vendedor=");
		builder.append(vendedor);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", listaProdutos=");
		builder.append(listaProdutos);
		builder.append("]");
		return builder.toString();
	}
	
}
