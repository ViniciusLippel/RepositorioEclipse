package trabalhoFinal;

public class Fila {

	private Processo inicioFila;
	private Processo fimFila;
	
	public boolean vazia() {
		if (inicioFila == null)
			return true;
		else
			return false;
	}
	
	public void add(Processo p) {
		if (vazia()) {
			p.setIndice(0);
			inicioFila = p;
		}
		else {
			p.setIndice(tamanho());
			fimFila.setProximo(p);
		}
		fimFila = p;
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
	
	public int tamanho(Processo p) {
		int t = 1;
		if (p.getProximo() != null) {
			return t + tamanho(p.getProximo());
		}
//		System.out.println(p);
		return t;
	}
	
	public int tamanho() {
		return tamanho(inicioFila);
	}
	
	private Processo get(int i, Processo p) {
		if (p.getIndice() == i)
			return p;
		return get(i, p.getProximo());
	}
	
	public String get(int i) {
		return get(i, inicioFila).toString();
	}
	
	public Processo getElemento(int i) {
		return get(i, inicioFila);
	}
	
	public String toString(Processo p) {
		StringBuilder builder = new StringBuilder();
		builder.append(p.toString());
		if(p.getProximo()!=null) { 
			builder.append(", ");
			builder.append(toString(p.getProximo()));
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
