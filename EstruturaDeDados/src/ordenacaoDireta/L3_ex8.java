package ordenacaoDireta;

import java.util.Scanner;

public class L3_ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n, maior, menor=0;
		double auxM=0;
		String auxN="";
		
		System.out.print("Número de alunos: ");
		n = entrada.nextInt();
		entrada.nextLine();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n], nota2 = new double[n], media = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("\nNome: ");
			nome[i] = entrada.nextLine();
			System.out.print("Nota 1: ");
			nota1[i] = entrada.nextDouble();
			System.out.print("Nota 2: ");
			nota2[i] = entrada.nextDouble();
			entrada.nextLine();
			
			media[i] = (nota1[i]*2+nota2[i]*3)/5;
		}
		
		for (int i=0; i<media.length-1; i++) {
			maior = i;
			auxM = media[i];
			auxN = nome[i];
			for (int j=i+1; j<media.length; j++) {
				if (media[j]>auxM) {
					maior = j;
					auxM = media[j];
					auxN = nome[j];
				}
			}
			media[maior] = media[i];
			media[i] = auxM;
			nome[maior] = nome[i];
			nome[i] = auxN;
		}
		
		System.out.println("\nAlunos por média (decrescente):");
		for (int i=0; i<media.length; i++)
			System.out.println(nome[i]+" "+media[i]);
		
		
		for (int i=0; i<nota1.length-1; i++) {
			menor = i;
			auxM = nota1[i];
			auxN = nome[i];
			for (int j=i+1; j<nota1.length; j++) {
				if (media[j]>auxM) {
					menor = j;
					auxM = nota1[j];
					auxN = nome[j];
				}
			}
			nota1[menor] = nota1[i];
			nota1[i] = auxM;
			nome[menor] = nome[i];
			nome[i] = auxN;
		}
		
		System.out.println("\nAlunos por nota 1 (crescente):");
		for (int i=0; i<media.length; i++)
			System.out.println(nome[i]+" "+nota1[i]);
		
		
		for (int i=0; i<nome.length; i++) {
			menor = i;
			auxN = nome[i];
			auxM = media[i];
			for (int j=i+1; j<nome.length; j++) {
				if (nome[i].compareTo(nome[j])>0) {
					menor = j;
					auxN = nome[j];
					auxM = media[j];
				}
			}
			nome[menor] = nome[i];
			nome[i] = auxN;
			media[menor] = media[i];
			media[i] = auxM;
		}
		
		System.out.println("\nAlunos reprovados:");
		for (int i=0; i<media.length; i++) {
			if (media[i]<7)
				System.out.println(nome[i]);
		}
		
		entrada.close();
	}

}
