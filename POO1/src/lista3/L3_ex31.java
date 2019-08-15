package lista3;

import java.util.Scanner;

public class L3_ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final int x = 10;
		double alto=0, baixo = Double.MAX_VALUE;
		int alto_i=0, baixo_i=0;
		int[] num = new int[x];
		double[] alt = new double[x];
		
		System.out.println("Numero e altura dos alunos: ");
		for (int i=0; i<x; i++) {
			System.out.print("\nAluno "+(i+1)+"\nNúmero: ");
			num[i] = entrada.nextInt();
			System.out.print("Altura: ");
			alt[i] = entrada.nextDouble();
			if (alt[i]>alto) {
				alto_i = num[i];
				alto = alt[i];
			}
			else if (alt[i]<baixo) {
				baixo_i = num[i];
				baixo = alt[i];
			}
			
		}
		
		System.out.println("\nAluno mais alto: \nNúmero: "+alto_i+"\nAltura: "+alto);
		System.out.println("\nAluno mais baixo: \nNúmero: "+baixo_i+"\nAltura: "+baixo);
		
		entrada.close();
	}

}
