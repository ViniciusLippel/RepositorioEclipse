package l7_ex4;

public class Carro extends Veiculo {

	private int portas;

	public Carro(boolean motor, int portas) {
		super(motor);
		this.setPortas(portas);
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		if(portas>0)
			this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [portas=");
		builder.append(portas);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
