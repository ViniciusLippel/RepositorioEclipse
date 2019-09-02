package bubble_sort;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int t, aux;
		
		t = entrada.nextInt();
		int[] vet = new int[t];
		
		for (int i=0; i<vet.length; i++) {
			vet[i] = entrada.nextInt();
		}
		
		for (int j=0; j<vet.length-1; j++) {
			for (int i=0; i<vet.length-1; i++) {
				if (vet[i]>vet[i+1]) {
					aux = vet[i+1];
					vet[i+1] = vet[i];
					vet[i] = aux;
				}
			}
		}
		
		for (int i=0; i<vet.length; i++)
			System.out.println(vet[i]);
		
		entrada.close();

	}

}
