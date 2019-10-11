package l6_ex8;

public class Pessoa {

	String nome;
	int idade;
	double peso;
	double altura;
	
	public void crescer(double m) {
		this.altura = this.altura+m;
	}
	
	public void envelhecer() {
		this.idade++;
		if(this.idade<21) {
			this.crescer(0.005);
		}
	}
	
	public void engordar(double qtd) {
		this.peso = this.peso+qtd;
	}
	
	public void emagrecer(double qtd) {
		this.peso = this.peso-qtd;
	}
}
