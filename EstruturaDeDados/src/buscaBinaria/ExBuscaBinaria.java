package buscaBinaria;

import java.util.Scanner;

public class ExBuscaBinaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetInt = {1,12,14,23,43,56,74,85};
		String[] vetStr = {"a","d","f","l","r","v"};
		
		System.out.print("Busca de inteiro: ");
		int n = entrada.nextInt();
		if(BuscaInteiro(vetInt, n)>=0)
			System.out.println(BuscaInteiro(vetInt, n));
		else
			System.out.println("Inexistente");
		
		entrada.nextLine();
		
		System.out.print("Busca de string: ");
		String str = entrada.nextLine();
		if(BuscaString(vetStr, str)>=0)
			System.out.println(BuscaString(vetStr, str));
		else
			System.out.println("Inexistente");
		
		entrada.close();
	}
	
	public static int BuscaInteiro(int[] vet, int n) {
		int inicio = 0;
		int fim = vet.length - 1;
		int meio;
		while (inicio <= fim) {
			meio = (inicio + fim)/2;
			if (n == vet[meio]) {
				return meio;
			}
			if (n < vet[meio])
				fim = meio - 1;
			else
				inicio = meio + 1;
		}
		return -1;
	}
	
	public static int BuscaString(String[] vet, String str) {
		int inicio = 0;
		int fim = vet.length - 1;
		int meio;
		while (inicio <= fim) {
			meio = (inicio + fim)/2;
			if (str.equalsIgnoreCase(vet[meio])) {
				return meio;
			}
			if (str.compareTo(vet[meio])<0)
				fim = meio - 1;
			else
				inicio = meio + 1;
		}
		return -1;
	}
	
}

