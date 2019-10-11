package academico;

public class Disciplina {

	private String nome;
	private Fase fase;
	
	public Disciplina(String nome, Fase fase) {
		super();
		this.setNome(nome);
		this.setFase(fase);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [nome=");
		builder.append(nome);
		builder.append(", fase=");
		builder.append(fase);
		builder.append("]");
		return builder.toString();
	}
	
}
