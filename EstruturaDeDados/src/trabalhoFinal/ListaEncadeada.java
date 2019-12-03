package trabalhoFinal;

public class ListaEncadeada {
	
	private Mesa inicioLista = null;
	private Mesa fimLista = null;
	
	public Mesa getInicioLista() {
		return inicioLista;
	}

	public void setInicioLista(Mesa inicioLista) {
		this.inicioLista = inicioLista;
	}

	public Mesa getFimLista() {
		return fimLista;
	}

	public void setFimLista(Mesa fimLista) {
		this.fimLista = fimLista;
	}
	
	public boolean vazia() {
		if (inicioLista == null)
			return true;
		else
			return false;
	}
	
	public void add(Mesa m) {
		if (vazia()) 
			inicioLista = m;
		else if(fimLista==null) {
			inicioLista.setProxima(m);
			fimLista = m;
		}
		else {
			ultimo(inicioLista).setProxima(m);
			fimLista = m;
		}
	}
	
	private Mesa get(int i, Mesa aux) {
		if (tamanho(aux)-1 == i)
			return aux;
		if(aux.getProxima()!=null)
			return get(i, aux.getProxima());
		else
			return null;
	}
	
	public Mesa get(int i) {
		return get(i, inicioLista);
	}
	
	public Mesa ultimo(Mesa m) {
		if(m != fimLista)
			return ultimo(m.getProxima());
		return m;
	}
	
	
	
	public void excluir(int i) {
		Mesa aux = inicioLista;
		boolean stop = false;
		if(i!=0) {
			while(aux.getProxima()!=null && !stop) {
				if(getIndice(aux.getProxima()) == i) 
					aux.setProxima(aux.getProxima().getProxima());
			}
		}
		else
			inicioLista = inicioLista.getProxima();
	}
	
	@SuppressWarnings("null")
	public int getIndice(Mesa m) {
		for(int i=0; i<tamanho(inicioLista); i++) {
			if(m == this.get(i,inicioLista))
				return i;
		}
		return (Integer) null;
	}
	
	public int tamanho() {
		return tamanho(inicioLista);
	}
	
	public int tamanho(Mesa aux) {
		int i = 1;
		if (aux.getProxima()!=null) {
			i = i+tamanho(aux.getProxima());
			return i;
		}
		else
			return 1;
	}
	
	public void inserirMeio() {
		
	}
	
	public Mesa ultimoRegistro(Mesa contato) {
		if (contato.getProxima() != null)
			return ultimoRegistro(contato.getProxima());
		else
			return contato;
	}
}
