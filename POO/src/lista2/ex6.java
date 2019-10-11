package lista2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um número: ");
		n = entrada.nextInt();
		
		n = n+1;
		
		if(n%2==0)
			System.out.println("O número era ímpar, agora é par: "+n);
		else
			System.out.println("O número era par, agora é impar: "+n);
		
		entrada.close();
	}

}
