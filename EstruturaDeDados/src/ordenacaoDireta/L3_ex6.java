package ordenacaoDireta;

import java.util.Scanner;

public class L3_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int qtd, menor;
		double auxS;
		String auxN;
		
		System.out.print("Quantidade de funcionários: ");
		qtd = entrada.nextInt();
		entrada.nextLine();
		
		String[] nome = new String[qtd];
		double[] salario = new double[qtd];
		
		for (int i=0; i<qtd; i++) {
			System.out.print("\nNome: ");
			nome[i] = entrada.nextLine();
			System.out.print("Salário: ");
			salario[i] = entrada.nextDouble();
			entrada.nextLine();
		}
		
		System.out.println("\nSalário crescente: ");
		for (int i=0; i<salario.length-1; i++) {
			menor = i;
			auxS = salario[i];
			for (int j=i+1; j<salario.length; j++) {
				if (salario[j]<auxS) {
					menor = j;
					auxS = salario[j];
				}
			}
			salario[menor] = salario[i];
			salario[i] = auxS;
		}
		for (int i=0; i<salario.length; i++)
			System.out.println(nome[i]+" / "+salario[i]);
		
		System.out.println("\nSalário decrescente: ");
		for (int i=0; i<salario.length-1; i++) {
			menor = i;
			auxS = salario[i];
			for (int j=i+1; j<salario.length; j++) {
				if (salario[j]>auxS) {
					menor = j;
					auxS = salario[j];
				}
			}
			salario[menor] = salario[i];
			salario[i] = auxS;
		}
		for (int i=0; i<salario.length; i++)
			System.out.println(nome[i]+" / "+salario[i]);
		
		System.out.println("\nOrdem alfabética:");
		for (int i=0; i<nome.length; i++) {
			menor = i;
			auxN = nome[i];
			for (int j=i+1; j<nome.length; j++) {
				if (nome[i].compareTo(nome[j])>0) {
					menor = j;
					auxN = nome[j];
				}
			}
			nome[menor] = nome[i];
			nome[i] = auxN;
		}
		for (int i=0; i<nome.length; i++)
			System.out.println(nome[i]+" / "+salario[i]);
		
		entrada.close();
	}

}
