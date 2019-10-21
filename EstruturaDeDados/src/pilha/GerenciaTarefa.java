package pilha;

public class GerenciaTarefa {
	
	private Tarefa topoPilha;
	
	public boolean vazia() {
		if (topoPilha == null)
			return true;
		else
			return false;
	}
	
	public void inserir(Tarefa nova) {
		if(vazia())
			topoPilha = nova;
		else
			nova.setProximo(topoPilha);
		topoPilha = nova;
	}
	
	public Tarefa remover() {
		Tarefa rem = topoPilha;
		topoPilha = topoPilha.getProximo();
		return rem;
	}
	
}
