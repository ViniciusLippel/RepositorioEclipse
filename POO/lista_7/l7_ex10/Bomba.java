package l7_ex10;

public class Bomba {
	
	private double totalLitros;
	private float valorLitro;
	
	public Bomba(double totalLitros, float valorLitro) {
		super();
		this.setTotalLitros(totalLitros);
		this.setValorLitro(valorLitro);
	}
	public double getTotalLitros() {
		return totalLitros;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	
	public void setTotalLitros(double totalLitros) {
		if(totalLitros>0)
			this.totalLitros = totalLitros;
	}
	public void setValorLitro(float valorLitro) {
		if(valorLitro>0)
			this.valorLitro = valorLitro;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
	
}
