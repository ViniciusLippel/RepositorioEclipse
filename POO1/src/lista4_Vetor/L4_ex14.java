package lista4_Vetor;

import java.util.Scanner;

public class L4_ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vet3 = new int[20];
		
		
		System.out.println("Vetor 1: ");
		for (int i=0; i<10; i++)
			vet1[i] = entrada.nextInt();
		
		System.out.println("\nVetor 2: ");
		for (int i=0; i<10; i++)
			vet2[i] = entrada.nextInt();
		
		int cont=0;
		for (int i=0; i<20; i++) {
			if (i%2==0)
				vet3[i] = vet1[cont];
			else {
				vet3[i] = vet2[cont];
				cont++;
			}
			
		}
		
		for (int i=0; i<20; i++)
			System.out.print(vet3[i]+"; ");
		
		entrada.close();
	}

}
