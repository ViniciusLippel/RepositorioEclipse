package lista4_Vetor;

import java.util.Scanner;

public class L4_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[5];
		
		System.out.println("Valores: ");
		for (int i=0; i<5; i++) {
			System.out.print("-> ");
			vetor[i] = entrada.nextInt();
		}
		
		for (int i=0; i<5; i++)
			System.out.print(vetor[i]+"; ");
		
		entrada.close();
	}

}
