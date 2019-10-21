package fila;

public class CallCenter {
	private Contato inicioFila = null;
	private Contato fimFila = null;
	
	public void inserirContato(Contato c) {
		if (vazia()) 
			inicioFila = c;
		else
			fimFila.setProximo(c);
		fimFila = c;
	}
	
	public void proximoContato() {
		Contato rem = inicioFila;
		inicioFila = inicioFila.getProximo();
		System.out.println(rem.getNome()+"\n"+rem.getFone()+"\n"+rem.getEmail());
	}
	
	public boolean vazia() {
		if (inicioFila == null)
			return true;
		else
			return false;
	}
}
