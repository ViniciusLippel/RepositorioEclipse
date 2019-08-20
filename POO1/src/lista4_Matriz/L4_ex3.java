package lista4_Matriz;

import java.util.Scanner;

public class L4_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[10];
		
		System.out.println("Valores: ");
		for (int i=0; i<10; i++) {
			System.out.print("-> ");
			vetor[i] = entrada.nextInt();
		}
		
		for (int i=9; i>=0; i--)
			System.out.print(vetor[i]+"; ");
		
		entrada.close();
	}

}
