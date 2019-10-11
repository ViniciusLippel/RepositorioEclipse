package lista4_Vetor;

import java.util.Scanner;

public class L4_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final int n = 10;
		int soma=0, maior=0, menor=0, media;
		int[] vetor = new int[n];
		
		System.out.println("Valores: ");
		for (int i=0; i<n; i++) {
			System.out.print("-> ");
			vetor[i] = entrada.nextInt();
			
			if (i==0)
				menor = vetor[i];
			
			if (vetor[i]>maior)
				maior = vetor[i];
			else if (vetor[i]<menor)
				menor = vetor[i];
			
			soma = soma+vetor[i];
		}
		
		media  = soma/n;
		
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+media);
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
		System.out.print("Pares: ");
		for (int i=0; i<n; i++) {
			if (vetor[i]%2==0)
				System.out.print(vetor[i]+"; ");
		}
		System.out.print("\nImpares: ");
		for (int i=0; i<n; i++) {
			if (vetor[i]%2!=0)
				System.out.print(vetor[i]+"; ");
		}
		System.out.print("\nAcima da média: ");
		for (int i=0; i<n; i++) {
			if (vetor[i]>media)
				System.out.print(vetor[i]+"; ");
		}
		System.out.print("\nAbaixo da media: ");
		for (int i=0; i<n; i++) {
			if (vetor[i]<media)
				System.out.print(vetor[i]+"; ");
		}
		
		entrada.close();
	}

}
