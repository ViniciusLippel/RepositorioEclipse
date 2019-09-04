package l7_ex3;

public class ContaEspecial extends Conta {
	
	private int diasSemJuros;
	private double limite;
	
	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int diasSemJuros, double limite) {
		super(banco, agencia, numeroconta, saldo);
		this.setDiasSemJuros(diasSemJuros);
		this.setLimite(limite);
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		if(diasSemJuros>=0)
			this.diasSemJuros = diasSemJuros;
	}
	public void setLimite(double limite) {
		if(limite>0)
			this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
