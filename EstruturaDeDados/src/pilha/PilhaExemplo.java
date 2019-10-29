package pilha;

public class PilhaExemplo {
	static Contato topoPilha = null;
	
	static boolean vazia() {
		if (topoPilha == null)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Contato novo = new Contato();
		novo.setNome("Vinicius");
		
		//inserir
		if(vazia())
			topoPilha = novo;
		else
			novo.setProximo(topoPilha);
		topoPilha = novo;
		
		//remover
		Contato rem = topoPilha;
		topoPilha = topoPilha.getProximo();
	}
}
