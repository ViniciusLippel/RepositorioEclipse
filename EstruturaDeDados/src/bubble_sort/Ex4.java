package bubble_sort;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int t;
		String aux;
		
		t = entrada.nextInt();
		entrada.nextLine();
		String[] vet = new String[t];
		
		for (int i=0; i<vet.length; i++) {
			vet[i] = entrada.nextLine();
		}
		
		for (int j=0; j<vet.length-1; j++) {
			for (int i=0; i<vet.length-1; i++) {
				if (vet[i].compareTo(vet[i+1])<0) {
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
