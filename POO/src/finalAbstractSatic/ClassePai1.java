package finalAbstractSatic;

public abstract class ClassePai1 { // Não é possível instanciar a classe
	
	private String Sobrenome;
	
	public final void Imprimir() { // Proíbe a sobrescrição do método
		System.out.println("Este print é do Pai");
	}
	
	public abstract String falar();
}

