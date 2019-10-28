package arvores;

public class Nodo {
	private int numero;
	private Nodo direita;
	private Nodo esquerda;
	private Nodo pai; //opcional
	
	public Nodo(int numero) {
		this.numero = numero;
		this.direita = null;
		this.esquerda = null;
		this.pai = null;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Nodo getDireita() {
		return direita;
	}

	public void setDireita(Nodo direita) {
		this.direita = direita;
	}

	public Nodo getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Nodo esquerda) {
		this.esquerda = esquerda;
	}

	public Nodo getPai() {
		return pai;
	}

	public void setPai(Nodo pai) {
		this.pai = pai;
	}
	
	
}
