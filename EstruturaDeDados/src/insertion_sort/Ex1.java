package insertion_sort;

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
		
		for (int i=0; i<vet.length; i++) {
			aux = vet[i];
			int pos = i;
			while (pos>0 && aux<vet[pos-1]) {
				vet[pos] = vet[pos-1];
				pos = pos-1;
			}
			vet[pos] = aux;
		}
		
		for (int i=0; i<vet.length; i++)
			System.out.println(vet[i]);
		
		entrada.close();

	}

}
