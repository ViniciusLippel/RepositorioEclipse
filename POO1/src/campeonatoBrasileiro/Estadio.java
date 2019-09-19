package campeonatoBrasileiro;

public class Estadio {

	private String nome;
	private int capacidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estadio [nome=");
		builder.append(nome);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append("]");
		return builder.toString();
	}
	
}
