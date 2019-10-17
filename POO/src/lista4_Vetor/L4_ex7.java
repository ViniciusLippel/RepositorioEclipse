package lista4_Vetor;

import java.util.Scanner;

public class L4_ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final double media=7;
		final int numNotas=4;
		double[] nota = new double[numNotas], mediaAluno = new double[10];
		int acima=0;
		
		for (int j=0; j<10; j++) {
			mediaAluno[j] = 0;
			System.out.println();
			for(int i=0; i<numNotas; i++) {
				System.out.print("Nota "+(i+1)+": ");
				nota[i] = entrada.nextDouble();
				mediaAluno[j] = mediaAluno[j]+nota[i];
			}
			mediaAluno[j] = mediaAluno[j]/numNotas;
			
			if (mediaAluno[j] > media)
				acima++;
		}
		
		System.out.println("Número de alunos acima da média: "+acima);
		
		entrada.close();
	}

}
