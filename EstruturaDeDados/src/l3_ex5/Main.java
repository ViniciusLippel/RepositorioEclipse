package l3_ex5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int ordem, tipo, tamanho;
		
		System.out.println("1- Ordenação por inteiros \n2- Ordenação por caracteres");
		tipo = entrada.nextInt();
		System.out.print("Tamanho do vetor: ");
		tamanho = entrada.nextInt();
		
		if (tipo==1) {
			int[] vetor = new int[tamanho];
			for (int i=0; i<tamanho; i++) {
				System.out.print("Valor "+(i+1)+": ");
				vetor[i] = entrada.nextInt();
			}
			
			System.out.println("1- Crescente \n2- Decrescente: ");
			ordem = entrada.nextInt();
		}
		else {
			String[] vetor = new String[tamanho];
			for (int i=0; i<tamanho; i++) {
				System.out.print("Valor "+(i+1)+": ");
				vetor[i] = entrada.nextLine();
			}
		}
		
		entrada.close();
		
	}

}
