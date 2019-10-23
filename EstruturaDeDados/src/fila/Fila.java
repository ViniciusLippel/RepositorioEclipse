package fila;

public class Fila {

	private Num inicioFila;
	private Num fimFila;
	
	public boolean vazia() {
		if (inicioFila == null)
			return true;
		else
			return false;
	}
	
	public void add(int n) {
		Num num = new Num();
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
	
	public Num pegarProximo() {
		Num prox = inicioFila;
		remover(inicioFila);
		return prox;
	}
	
	public void remover(Num num) {
		inicioFila = inicioFila.getProximo();
	}
	
	public int tamanho(Num num) {
		int t = 1;
		if (num.getProximo() != null)
			return t + tamanho(num.getProximo());
		return t;
	}
	
	public int tamanho() {
		return tamanho(inicioFila);
	}
	
	private Num get (int i, Num num) {
		if (num.getIndice() == i)
			return num;
		return get(i, num.getProximo());
	}
	
	public int get(int i) {
		return get(i, inicioFila).getNum();
	}
	
	public Num getElemento(int i) {
		return get(i, inicioFila);
	}
}
