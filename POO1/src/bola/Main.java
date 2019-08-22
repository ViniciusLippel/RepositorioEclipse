package bola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String cor;
		
		Bola bola = new Bola();
		
		cor = entrada.nextLine();
		
		bola.setCor(cor);
		
		System.out.println(bola.getCor());
		
		entrada.close();
	}

}
