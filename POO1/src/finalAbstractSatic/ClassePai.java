package finalAbstractSatic;

public final class ClassePai { // Não é possível extender a classe
	
	private String Sobrenome;
	
	public final void Imprimir() { // Proíbe a sobrescrição do método
		System.out.println("Este print é do Pai");
	}
}
