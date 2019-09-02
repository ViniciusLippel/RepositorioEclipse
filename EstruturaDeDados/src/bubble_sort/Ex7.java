package bubble_sort;

import java.util.Scanner;

public class Ex7 {

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
		
		int soma=1;
		
		for (int i=1; i<vet.length; i++) {
			if (vet[i]==vet[0])
				soma++;
		}
		
		System.out.println(vet[0]);
		System.out.println(soma);
		
		entrada.close();
	}

}
