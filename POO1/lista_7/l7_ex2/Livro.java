package l7_ex2;

public class Livro extends Item {
	
	private String autor;
	
	public Livro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		this.setAutor(autor);
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
