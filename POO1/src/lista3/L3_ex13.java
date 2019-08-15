package lista3;

import java.util.Scanner;

public class L3_ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n, fat=1;
		
		System.out.print("Número: ");
		n = entrada.nextInt();
		
		System.out.println("Fatorial:");
		System.out.print(n);
		for (int i=0; i<n; i++) {
			fat = fat*(n-i);
			if (i!=0)
				System.out.print("*"+(n-i));
		}
		
		System.out.println(" = "+fat);
		
		entrada.close();
	}

}
