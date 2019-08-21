package lista4_Vetor;

import java.util.Scanner;

public class L4_ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int soma=0, mult=1;
		int[] num = new int[5];
		
		System.out.println("Números: ");
		for (int i=0; i<5; i++) {
			System.out.print("-> ");
			num[i] = entrada.nextInt();
			soma = soma+num[i];
			mult = mult*num[i];
		}
		
		System.out.println("Soma: "+soma);
		System.out.println("Multiplicação: "+mult);
		System.out.print("Números: ");
		for (int i=0; i<5; i++)
			System.out.print(num[i]+"; ");
		
		entrada.close();
	}

}
