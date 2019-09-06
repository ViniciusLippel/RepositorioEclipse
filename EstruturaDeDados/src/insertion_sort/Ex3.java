package insertion_sort;

import java.util.Scanner;

public class Ex3 {

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
		
		for (int i=0; i<vet.length; i++) {
			aux = vet[i];
			int pos = i;
			while (pos>0 && vet[pos-1].compareTo(aux)>0) {
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
