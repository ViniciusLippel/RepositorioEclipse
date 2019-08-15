package lista2;

import java.util.Scanner;

public class ex25b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um número: ");
		n = entrada.nextInt();
		
		if(n%2==0)
			System.out.println("Par");
		else
			System.out.println("Ímpar");
		
		entrada.close();
	}

}
