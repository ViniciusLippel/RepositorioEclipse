package bubble_sort;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int aux;
		int[] vetor = new int[7];
		
		for (int i=0; i<vetor.length; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		
		System.out.println();
		
		for (int j=0; j<vetor.length-1; j++) {
			for (int i=0; i<vetor.length-1; i++) {
				if (vetor[i]>vetor[i+1]) {
					aux = vetor[i+1];
					vetor[i+1] = vetor[i];
					vetor[i] = aux;
					for (int x=0; x<vetor.length; x++)
						System.out.print(vetor[x]+" ");
					System.out.println();
				}
			}
		}
		
		System.out.println(vetor.length-1+" varreduras");
		
		entrada.close();
	}

}
