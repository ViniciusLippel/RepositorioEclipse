package fila;

public class Fila {
	static Contato inicioFila = null;
	static Contato fimFila = null;
	
	static boolean vazia() {
		if (inicioFila == null)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		//adicionar
		Contato novo = new Contato();
		novo.setNome("Vinicius");
		
		novo = new Contato();
		novo.setNome("Lippel");
		
		if (vazia()) 
			inicioFila = novo;
		else
			fimFila.setProximo(novo);
		fimFila = novo;
		
		//remover
		Contato rem = inicioFila;
		inicioFila = inicioFila.getProximo();
	}
}
