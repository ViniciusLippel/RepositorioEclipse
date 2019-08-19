package ordenacaoDireta;

import java.util.Scanner;

public class L3_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menor, tamanho;
		String aux;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Tamanho do array: ");
		tamanho = entrada.nextInt();
		entrada.nextLine();
		String[] str = new String[tamanho];
		
		for (int i=0; i<str.length; i++) {
			System.out.print("Valor "+(i+1)+": ");
			str[i] = entrada.nextLine();
		}
		
		for (int i=0; i<str.length; i++) {
			menor = i;
			aux = str[i];
			for (int j=i+1; j<str.length; j++) {
				if (str[i].compareTo(str[j])<0) {
					menor = j;
					aux = str[j];
				}
			}
			str[menor] = str[i];
			str[i] = aux;
		}
		
		for (int i=0; i<str.length; i++)
			System.out.println(str[i]);
		
		entrada.close();
	}

}
