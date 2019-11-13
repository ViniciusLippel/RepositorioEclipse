package trabalhoFinal;

public class Pilha {

	private Processo topoPilha;
	
	public boolean vazia() {
		if (topoPilha == null)
			return true;
		else
			return false;
	}
	
	public void add(Processo p) {
		if(vazia()) {
			p.setIndice(0);
			topoPilha = p;
		}
		else {
			p.setIndice(tamanho());
			p.setProximo(topoPilha);
		}
		topoPilha = p;
	}
	
	public Processo proxima() {
		Processo rem = topoPilha;
		topoPilha = topoPilha.getProximo();
		return rem;
	}
	
	public void remover() {
		topoPilha.getProximo().setIndice(topoPilha.getIndice());
		topoPilha = topoPilha.getProximo();
	}
	
	public int tamanho(Processo p) {
		int t = 1;
		if (p.getProximo() != null)
			return t + tamanho(p.getProximo());
		return t;
	}
	
	public int tamanho() {
		return tamanho(topoPilha);
	}
	
	private Processo get(int i, Processo p) {
		if (p.getIndice() == i)
			return p;
		return get(i, p.getProximo());
	}
	
	public String get(int i) {
		return get(i, topoPilha).getDescricao();
	}
	
	public Processo getElemento(int i) {
		return get(i, topoPilha);
	}
	
	public String toString(Processo p) {
		StringBuilder builder = new StringBuilder();
		builder.append(p.getDescricao());
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
		builder.append(toString(topoPilha));
		builder.append("]");
		return builder.toString();
	}
}
