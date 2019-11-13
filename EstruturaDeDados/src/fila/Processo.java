package fila;

public class Processo {
	
	private int indice;
	private int num;
	private Processo proximo;
	
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public Processo getProximo() {
		return proximo;
	}
	public void setProximo(Processo proximo) {
		this.proximo = proximo;
	}
	
}
