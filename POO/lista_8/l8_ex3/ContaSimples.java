package l8_ex3;

public class ContaSimples extends ContaBancaria {
	
	private double saldoPoupanca;
	
	public ContaSimples(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa correntista,
			double saldoPoupanca) {
		super(banco, agencia, numeroDaConta, saldo, correntista);
		this.setSaldoPoupanca(saldoPoupanca);
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if(saldoPoupanca>=0)
			this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		if (valor>0) {
			this.saldoPoupanca = this.saldoPoupanca+valor;
			return true;
		}
		else
			return false;
	}
	
	public boolean saquePoupanca(double valor) {
		if (valor>0 && this.saldoPoupanca-valor>=0) {
			this.saldoPoupanca = this.saldoPoupanca - valor;
			return true;
		}
		else
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	} 
	
}
