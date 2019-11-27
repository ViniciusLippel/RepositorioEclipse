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
		else if(fimFila==null) {
			p.setIndice(1);
			inicioFila.setProximo(p);
			fimFila = p;
		}
		else {
			p.setIndice(tamanho());
			ultimo(inicioFila).setProximo(p);
			fimFila = p;
		}
	}
	
	public Processo ultimo(Processo p) {
		if(p != fimFila)
			return ultimo(p.getProximo());
		return p;
	}
	
	public Processo pegarProximo() {
		Processo prox = inicioFila;
		remover();
		return prox;
	}
	

	public void remover() {
		if(inicioFila.getProximo()!=null)
			inicioFila.getProximo().setIndice(inicioFila.getIndice());
		inicioFila = inicioFila.getProximo();
	}
	
	public int tamanho(Processo p) {
		int t = 1;
//		System.out.println(p);
		if (p != fimFila) {
			return t + tamanho(p.getProximo());
		}
		else
			return t;
	}
	
	public int tamanho() {
		return tamanho(inicioFila);
	}
	
	private Processo get(int i, Processo p) {
		if (p.getIndice() == i)
			return p;
		if(p.getProximo()!=null)
			return get(i, p.getProximo());
		else
			return null;
	}
	
	public String get(int i) {
		return get(i, inicioFila).toString();
	}
	
	public Processo getElemento(int i) {
		return get(i, inicioFila);
	}
	
	public String toString() {
		return inicioFila.toString();
	}

	public Processo getInicioFila() {
		return inicioFila;
	}

	public void setInicioFila(Processo inicioFila) {
		this.inicioFila = inicioFila;
	}

	public Processo getFimFila() {
		return fimFila;
	}

	public void setFimFila(Processo fimFila) {
		this.fimFila = fimFila;
	}
	
	
	
}
