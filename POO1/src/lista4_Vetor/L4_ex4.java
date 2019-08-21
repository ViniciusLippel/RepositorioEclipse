package lista4_Vetor;

import java.util.Scanner;

public class L4_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[4];
		double media=0;
		
		System.out.println("Notas: ");
		for (int i=0; i<4; i++) {
			System.out.print("-> ");
			notas[i] = entrada.nextDouble();
			media = media+notas[i];
		}
		
		media = media/4;
		
		System.out.println("\nNotas: ");
		for (int i=0; i<4; i++)
			System.out.println("-> "+notas[i]);
		System.out.println("Média: "+media);
		
		entrada.close();
	}

}
