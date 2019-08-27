package l6_ex3;

public class Calculadora {

	private int n1;
	private int n2;
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		if(n1>0)
			this.n1 = n1;
	}
	
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		if (n2>0)
			this.n2 = n2;
	}
	
	public int soma() {
		return this.n1+this.n2;
	}
	
	public int subtracao() {
		return this.n1-this.n2;
	}
	
	public int multiplicacao() {
		return this.n1*this.n2;
	}
	
	public int divisao() {
		return this.n1/this.n2;
	}
}
