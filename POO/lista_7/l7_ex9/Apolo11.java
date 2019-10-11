package l7_ex9;

public class Apolo11 extends NaveEspacial {
	
	private String tipoCombustivel;
	
	public Apolo11(double velocidadeMaxima, String tipoCombustivel) {
		super(velocidadeMaxima);
		this.setTipoCombustivel(tipoCombustivel);
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		if(tipoCombustivel!="")
			this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apolo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
