package lista3;

import java.util.Scanner;

public class L3_ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		boolean primo = true;
		
		System.out.print("Número: ");
		n = entrada.nextInt();
		
		for (int i=2; i<=n/2; i++) {
			if (n%i==0)
				primo = false;
		}
		
		if(primo)
			System.out.println("É primo");
		else
			System.out.println("Não é primo");
		
		entrada.close();
	}

}
