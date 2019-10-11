package l7_ex2;

public class Item {
	
	private int codigo;
	private String descricao;
	
	public Item(int codigo, String descricao) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
	}
	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
