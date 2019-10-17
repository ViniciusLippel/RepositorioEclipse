package diagramaPedido;

import java.util.Date;
import java.util.ArrayList;

public class Pedido extends Operacao {

	private int codigo;
	private Vendedor vendedor;
	private Cliente cliente;
	private ArrayList<Produto> listaProdutos;
	
	public Pedido(Date dtInicio, int codigo, Vendedor vendedor, Cliente cliente) {
		super(dtInicio);
		this.codigo = codigo;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.listaProdutos = new ArrayList<>();
	}

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
	public boolean addProduto(Produto produto) {
		if (!verificaProdutoUnico(produto)) {
			this.listaProdutos.add(produto);
			return true;
		}
		return false;
	}
	
	public void finalizarPedido(Date dtFim) {
		this.setDtFim(dtFim);
	}
	
	public boolean verificaProdutoUnico(Produto produto) {
		for (int i=0; i<this.listaProdutos.size(); i++) {
			if (listaProdutos.get(i) == produto)
				return true;
		}
		return false;
	}
	
	public double totalPedido() {
		double total = 0;
		for (int i=0; i<listaProdutos.size(); i++){
			total = total+listaProdutos.get(i).totalItem();
		}
		return total;
	}
	
	public double valorMedio() {
		double soma = 0;
		for (int i=0; i<listaProdutos.size(); i++) {
			soma = soma+listaProdutos.get(i).getValor();
		}
		return soma/listaProdutos.size();
	}
	
	public ArrayList<Produto> quantidadeMaior(int quantidade){
		ArrayList<Produto> qtd = new ArrayList<>();
		for (int i=0; i<listaProdutos.size(); i++) {
			if (listaProdutos.get(i).getQuantidade() > quantidade)
				qtd.add(listaProdutos.get(i));
		}
		return qtd;
	}
	
	public String nomeVendedor() {
		return vendedor.getNome();
	}
	
	public String emailCliente() {
		return cliente.getEmail();
	}
	
	public ArrayList<Produto> buscaProdutoDescricao(String descricao){
		ArrayList<Produto> qtd = new ArrayList<>();
		for (int i=0; i<listaProdutos.size(); i++) {
			if(listaProdutos.get(i).getDescricao().compareToIgnoreCase(descricao) < listaProdutos.get(i).getDescricao().length() && 
					listaProdutos.get(i).getDescricao().compareToIgnoreCase(descricao) >= 0) {
				qtd.add(listaProdutos.get(i));
			}
				
		}
		return qtd;
	}
	
	public int dias() {
		long dif = dtFim.getTime() - dtInicio.getTime();
		return (int) (dif / 1000 / 60 / 60 / 24);
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
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
