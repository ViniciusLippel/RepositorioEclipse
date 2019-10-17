package campeonatoBrasileiro;

public class Campeonato {

	private int ano;

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Campeonato [ano=");
		builder.append(ano);
		builder.append("]");
		return builder.toString();
	}
	
}
