package l7_ex8;

public class Cozinha extends Ambiente {
	
	private boolean microondas;
	
	public Cozinha(float area, boolean microondas) {
		super(area);
		this.setMicroondas(microondas);
	}

	public boolean isMicroondas() {
		return microondas;
	}

	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cozinha [microondas=");
		builder.append(microondas);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
