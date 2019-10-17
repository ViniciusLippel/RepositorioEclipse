package lista4_Vetor;

import java.util.Scanner;

public class L4_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final int t=20;
		int[] num = new int[t], pares = new int[t], impares = new int[t];
		
		System.out.println("20 numeros: ");
		for (int i=0; i<t; i++) {
			System.out.print("-> ");
			num[i] = entrada.nextInt();
			if (num[i]%2==0)
				pares[i]=num[i];
			else
				impares[i] = num[i];
		}
		
		System.out.println("Números: ");
		for (int i=0; i<t; i++)
			System.out.print(num[i]+"; ");
		System.out.println("Pares: ");
		for (int i=0; i<t; i++) {
			if (pares[i]!=0)
				System.out.print(pares[i]+"; ");
		}
		System.out.println("Impares: ");
		for (int i=0; i<t; i++) {
			if (impares[i]!=0)
				System.out.print(impares[i]+"; ");
		}
		
		entrada.close();
	}

}
