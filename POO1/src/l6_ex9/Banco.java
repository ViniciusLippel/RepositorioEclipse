package l6_ex9;

public class Banco {

	int numConta;
	String nome;
	double saldo;
	
	public void incluirConta(int numConta, String nome, double saldo) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void alterarNome(String nome) {
		this.nome = nome;
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo+valor;
	}
	
	public void saque(double valor) {
		this.saldo = this.saldo-valor;
	}
}
