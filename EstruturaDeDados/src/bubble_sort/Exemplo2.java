package bubble_sort;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String aux;
		String[] vetor = new String[7];
		
		for (int i=0; i<vetor.length; i++) {
			vetor[i] = entrada.nextLine();
		}
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		
		System.out.println();
		
		int varreduras=0;
		
		for (int j=0; j<vetor.length-1; j++) {
			int cont=0;
			for (int i=0; i<vetor.length-1; i++) {
				if (vetor[i].compareTo(vetor[i+1])>0) {
					aux = vetor[i+1];
					vetor[i+1] = vetor[i];
					vetor[i] = aux;
					for (int x=0; x<vetor.length; x++)
						System.out.print(vetor[x]+" ");
					System.out.println();
					cont++;
				}
			}
			if (cont>0)
				varreduras++;
		}
		
		System.out.println("\n"+varreduras+" varreduras");
		
		entrada.close();
	}

}
