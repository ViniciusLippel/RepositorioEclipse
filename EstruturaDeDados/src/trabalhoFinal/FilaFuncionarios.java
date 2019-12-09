package trabalhoFinal;

public class FilaFuncionarios {
	private Funcionario inicioFila;
	private Funcionario fimFila;
	
	public boolean vazia() {
		if (inicioFila == null)
			return true;
		else
			return false;
	}
	
	public void add(Funcionario p) {
		if (vazia()) {
			inicioFila = p;
		}
		else if(fimFila==null) {
			inicioFila.setProximo(p);
			fimFila = p;
		}
		else {
			ultimo(inicioFila).setProximo(p);
			fimFila = p;
		}
	}
	
	public Funcionario ultimo(Funcionario p) {
		if(p != fimFila)
			return ultimo(p.getProximo());
		return p;
	}
	
	public Funcionario pegarProximo() {
		Funcionario prox = inicioFila;
		remover();
		return prox;
	}
	

	public void remover() {
		inicioFila = inicioFila.getProximo();
	}
	
	public int tamanho(Funcionario p) {
		if (p != fimFila) {
			return 1 + tamanho(p.getProximo());
		}
		else
			return 1;
	}
	
	public int tamanho() {
		return tamanho(inicioFila);
	}
	
	private Funcionario get(int i) {
		Funcionario aux = inicioFila;
		if(i<tamanho()) {
			for(int x=0; x<=i; i++)
				if(x!=i)
					aux = aux.getProximo();
		}
		return aux;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FilaFuncionarios [inicioFila=");
		builder.append(inicioFila);
		builder.append("]");
		return builder.toString();
	}

	public Funcionario getInicioFila() {
		return inicioFila;
	}

	public void setInicioFila(Funcionario inicioFila) {
		this.inicioFila = inicioFila;
	}

	public Funcionario getFimFila() {
		return fimFila;
	}

	public void setFimFila(Funcionario fimFila) {
		this.fimFila = fimFila;
	}
	
}
