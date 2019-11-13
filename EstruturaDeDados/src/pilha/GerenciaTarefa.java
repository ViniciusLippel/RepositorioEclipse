package pilha;

public class GerenciaTarefa {
	
	private Processo topoPilha;
	
	public boolean vazia() {
		if (topoPilha == null)
			return true;
		else
			return false;
	}
	
	public void inserir(Processo nova) {
		if(vazia())
			topoPilha = nova;
		else
			nova.setProximo(topoPilha);
		topoPilha = nova;
	}
	
	public Processo remover() {
		Processo rem = topoPilha;
		topoPilha = topoPilha.getProximo();
		return rem;
	}
	
}
