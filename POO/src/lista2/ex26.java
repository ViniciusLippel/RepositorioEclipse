package lista2;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double n;
		
		System.out.println("Digite um número: ");
		n = entrada.nextDouble();
		
		if(n == Math.round(n))
			System.out.println("Inteiro");
		else
			System.out.println("Real");
		
		entrada.close();
	}

}
