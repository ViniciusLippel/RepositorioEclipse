package finalAbstractSatic;

public abstract class ClassePai1 { // N�o � poss�vel instanciar a classe
	
	private String Sobrenome;
	
	public final void Imprimir() { // Pro�be a sobrescri��o do m�todo
		System.out.println("Este print � do Pai");
	}
	
	public abstract String falar();
}

