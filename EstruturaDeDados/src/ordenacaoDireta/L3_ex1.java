package ordenacaoDireta;

import java.util.Scanner;

public class L3_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux, menor, tamanho;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Tamanho do array: ");
		tamanho = entrada.nextInt();
		int[] num = new int[tamanho];
		
		for (int i=0; i<num.length; i++) {
			System.out.print("Valor "+(i+1)+": ");
			num[i] = entrada.nextInt();
		}
		
		System.out.println("\nOrdem crescente: ");
		for (int i=0; i<num.length-1; i++) {
			menor = i;
			aux = num[i];
			for (int j=i+1; j<num.length; j++) {
				if (num[j]<aux) {
					menor = j;
					aux = num[j];
				}
			}
			num[menor] = num[i];
			num[i] = aux;
		}
		
		for (int i=0; i<num.length; i++)
			System.out.println(num[i]);
		
		entrada.close();
	}

}
