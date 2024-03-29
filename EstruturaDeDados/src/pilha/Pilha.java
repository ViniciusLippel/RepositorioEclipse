package pilha;

public class Pilha {

	private Processo topoPilha;
	
	public boolean vazia() {
		if (topoPilha == null)
			return true;
		else
			return false;
	}
	
	public void add(String desc) {
		Processo nova = new Processo();
		nova.setDescricao(desc);
		if(vazia()) {
			nova.setIndice(0);
			topoPilha = nova;
		}
		else {
			nova.setIndice(tamanho());
			nova.setProximo(topoPilha);
		}
		topoPilha = nova;
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
	
	public int tamanho(Processo tarefa) {
		int t = 1;
		if (tarefa.getProximo() != null)
			return t + tamanho(tarefa.getProximo());
		return t;
	}
	
	public int tamanho() {
		return tamanho(topoPilha);
	}
	
	private Processo get(int i, Processo tarefa) {
		if (tarefa.getIndice() == i)
			return tarefa;
		return get(i, tarefa.getProximo());
	}
	
	public String get(int i) {
		return get(i, topoPilha).getDescricao();
	}
	
	public Processo getElemento(int i) {
		return get(i, topoPilha);
	}
	
	public String toString(Processo num) {
		StringBuilder builder = new StringBuilder();
		builder.append(num.getDescricao());
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
		builder.append(toString(topoPilha));
		builder.append("]");
		return builder.toString();
	}
}
