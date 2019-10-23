package fila;

public class FilaTeste {
	static Contato inicioFila = null;
	static Contato fimFila = null;
	
	static boolean vazia() {
		if (inicioFila == null)
			return true;
		else
			return false;
	}
	
	static void add(Contato novo) {
		
		if (vazia()) 
			inicioFila = novo;
		else {
			fimFila.setProximo(novo);
		}
		fimFila = novo;
	}
	
	public static void main(String[] args) {
		//adicionar
		Contato novo = new Contato();
		novo.setNome("Vinicius");
		add(novo);
		
		novo = new Contato();
		novo.setNome("george");
		add(novo);
		
		novo = new Contato();
		novo.setNome("asdoajfs");
		add(novo);
		
		novo = new Contato();
		novo.setNome("hidjofs");
		add(novo);
		
		
		//remover
		Contato rem = inicioFila;
		inicioFila = inicioFila.getProximo();
		
		System.out.println(fimFila);
		System.out.println(fimFila.getProximo());
		System.out.println(inicioFila.getProximo().getProximo());
	}
}
