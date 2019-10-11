package l7_ex3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaSimples cs = new ContaSimples("Bancotop", 276, 198223, 100.50, 2000.75);
		System.out.println(cs);
		
		ContaEspecial ce = new ContaEspecial("Bancozica", 290, 928357, 198.30, 5, 265);
		System.out.println(ce);
	}

}
