package l7_ex3;

public class Conta {
	
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	
	public Conta(String banco, int agencia, int numeroconta, double saldo) {
		super();
		this.setBanco(banco);
		this.setAgencia(agencia);
		this.setNumeroconta(numeroconta);
		this.setSaldo(saldo);
	}
	
	public String getBanco() {
		return banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setBanco(String banco) {
		if(banco!="")
			this.banco = banco;
	}
	public void setAgencia(int agencia) {
		if(agencia>0)
			this.agencia = agencia;
	}
	public void setNumeroconta(int numeroconta) {
		if(numeroconta>0)
			this.numeroconta = numeroconta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean deposito(double valor) {
		boolean valida = false;
		this.saldo = this.saldo+valor;
		if(this.saldo == this.saldo+valor) {
			valida = true;
		}
		return valida;
	}
	
	public boolean saque(double valor) {
		int limite = -1000;
		boolean valida = true;
		if(this.saldo-valor>limite) {
			valida = true;
			this.saldo = this.saldo-valor;
		}
		return valida;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
}
