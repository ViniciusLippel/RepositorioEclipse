package trabalhoFinal;

public class Pilha {

	private Processo topoPilha;
	
	public boolean vazia() {
		if (topoPilha == null)
			return true;
		else
			return false;
	}
	
	public void add(Processo q) {
		Processo p = q;
//		p.setProximo(null);
		if(vazia()) {
			p.setIndice(0);
			topoPilha = p;
			p.setProximo(null);
		}
		else {
			p.setIndice(tamanho());
			p.setProximo(topoPilha);
			topoPilha = p;
		}
	}
	
	public Processo verificarProxima() {
		return topoPilha;
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
		if (p.getProximo() != null)
			return 1 + tamanho(p.getProximo());
		else
			return 1;
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
		int tamanho = tamanho();
		Processo aux = p;
//		for(int i=0; i<3; i++) {
//			builder.append(aux.getProximo());
//			aux = aux.getProximo();
//		}
		return topoPilha.toString();
	}

	public Processo getTopoPilha() {
		return topoPilha;
	}

	public void setTopoPilha(Processo topoPilha) {
		this.topoPilha = topoPilha;
	}
	
	@Override
	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Pilha [");
//		builder.append(toString(topoPilha));
//		builder.append("]");
//		return builder.toString();
		return topoPilha.toString();
	}
	
	public String testeRetorno() {
		return topoPilha.getDescricao();
	}
	
	
}
