package l7_ex2;

public class Vhs extends Midia {
	
	private String titulo;
	
	public Vhs(int codigo, String descricao, String gravadora, float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vhs [titulo=");
		builder.append(titulo);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
