package l6_ex7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Quadrado quad = new Quadrado();
		
		quad.setTamanhoDoLado(entrada.nextInt());
		System.out.println(quad.getTamanhoDoLado());
		System.out.println(quad.calcularArea());
		
		entrada.close();
	}

}
