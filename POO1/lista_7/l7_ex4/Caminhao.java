package l7_ex4;

public class Caminhao extends Veiculo {

	private int eixos;

	public Caminhao(boolean motor, int eixos) {
		super(motor);
		this.setEixos(eixos);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		if(eixos>=2)
			this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caminhao [eixos=");
		builder.append(eixos);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
