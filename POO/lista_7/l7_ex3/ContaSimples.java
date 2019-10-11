package l7_ex3;

public class ContaSimples extends Conta {
	
	private double saldoPoupanca;
	
	public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldoPoupanca) {
		super(banco, agencia, numeroconta, saldo);
		this.setSaldoPoupanca(saldoPoupanca);
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		boolean valida = false;
		this.saldoPoupanca = this.saldoPoupanca+valor;
		if(this.saldoPoupanca == this.saldoPoupanca+valor) {
			valida = true;
		}
		return valida;
	}
	
	public boolean saquePoupanca(double valor) {
		boolean valida = true;
		if(this.saldoPoupanca-valor>0) {
			valida = true;
			this.saldoPoupanca = this.saldoPoupanca-valor;
		}
		return valida;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
