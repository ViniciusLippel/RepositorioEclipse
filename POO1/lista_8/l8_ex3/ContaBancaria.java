package l8_ex3;

public class ContaBancaria {
	
	private Banco banco;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	private Pessoa correntista;
	
	public Banco getBanco() {
		return banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public Pessoa getCorrentista() {
		return correntista;
	}
	
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	
	public boolean deposito(double valor) {
		this.saldo = this.saldo+valor;
		return true;
	}
	public boolean saque(double valor) {
		boolean valida = false;
		if (this.saldo-valor>0) {
			this.saldo = this.saldo-valor;
			valida = true;
		}
		return valida;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("contaBancaria [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroDaConta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}
	
}
