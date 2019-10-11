package l7_ex8;

public class Sala extends Ambiente {
	
	private boolean Sala;
	
	public Sala(float area, boolean sala) {
		super(area);
		this.setSala(sala);
	}

	public boolean isSala() {
		return Sala;
	}

	public void setSala(boolean sala) {
		Sala = sala;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sala [Sala=");
		builder.append(Sala);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
