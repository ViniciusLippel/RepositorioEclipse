package l7_ex8;

public class Quarto extends Ambiente {
	
	private int capacidade;
	
	public Quarto(float area, int capacidade) {
		super(area);
		this.setCapacidade(capacidade);
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
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
