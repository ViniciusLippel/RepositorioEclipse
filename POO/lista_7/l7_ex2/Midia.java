package l7_ex2;

public class Midia extends Item {
	
	private String gravadora;
	private float duracao;
	
	public Midia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		this.setGravadora(gravadora);
		this.setDuracao(duracao);
	}
	
	public String getGravadora() {
		return gravadora;
	}
	public float getDuracao() {
		return duracao;
	}
	
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
}
