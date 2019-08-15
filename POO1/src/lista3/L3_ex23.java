package lista3;

import java.util.Scanner;

public class L3_ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int qtd;
		double soma=0, media=0;
		
		System.out.print("Quantidade de turmas: ");
		qtd = entrada.nextInt();
		
		double[] alunos = new double[qtd];
		System.out.println("Nº de pessoas: ");
		for (int i=0; i<qtd; i++) {
			System.out.print(i+1+"º Turma: ");
			alunos[i] = entrada.nextDouble();
			if (alunos[i]>0 && alunos[i]<=40) {
				while(alunos[i]>40)
					soma = soma+alunos[i];
			}
		}
		
		media = soma/qtd;
		
		System.out.println("Média de alunos por turma: "+media);
		
		entrada.close();
	}

}
