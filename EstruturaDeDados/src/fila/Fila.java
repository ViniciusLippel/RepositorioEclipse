package fila;

public class Fila {

	private Processo inicioFila;
	private Processo fimFila;
	
	public boolean vazia() {
		if (inicioFila == null)
			return true;
		else
			return false;
	}
	
	public void add(int n) {
		Processo num = new Processo();
		num.setNum(n);
		if (vazia()) {
			num.setIndice(0);
			inicioFila = num;
		}
		else {
			num.setIndice(tamanho());
			fimFila.setProximo(num);
		}
		fimFila = num;
	}
	
	public Processo pegarProximo() {
		Processo prox = inicioFila;
		remover(inicioFila);
		return prox;
	}
	
	public void remover(Processo num) {
		inicioFila.getProximo().setIndice(inicioFila.getIndice());
		inicioFila = inicioFila.getProximo();
	}
	
	public int tamanho(Processo num) {
		int t = 1;
		if (num.getProximo() != null)
			return t + tamanho(num.getProximo());
		return t;
	}
	
	public int tamanho() {
		return tamanho(inicioFila);
	}
	
	private Processo get(int i, Processo num) {
		if (num.getIndice() == i)
			return num;
		return get(i, num.getProximo());
	}
	
	public int get(int i) {
		return get(i, inicioFila).getNum();
	}
	
	public Processo getElemento(int i) {
		return get(i, inicioFila);
	}
	
	public String toString(Processo num) {
		StringBuilder builder = new StringBuilder();
		builder.append(num.getNum());
		if(num.getProximo()!=null) { 
			builder.append(", ");
			builder.append(toString(num.getProximo()));
		}
		return builder.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fila [");
		builder.append(toString(inicioFila));
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
