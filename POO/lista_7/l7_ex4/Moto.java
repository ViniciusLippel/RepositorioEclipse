package l7_ex4;

public class Moto extends Veiculo {
	
	private int cilindradas;
	
	public Moto(boolean motor, int cilindradas) {
		super(motor);
		this.setCilindradas(cilindradas);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		if(cilindradas>=125)
			this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Moto [cilindradas=");
		builder.append(cilindradas);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
