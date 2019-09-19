package buscaSequencial;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetInt = {1,65,23,54,85,23,43,14};
		String[] vetStr = {"a","g","y","k"};
		
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
		for(int i=0; i<vet.length; i++) {
			if(vet[i]==n)
				return i;
		}
		return -1;
	}
	
	public static int BuscaString(String[] vet, String str) {
		for(int i=0; i<vet.length; i++) {
			if(vet[i].equalsIgnoreCase(str))
				return i;
		}
		return -1;
	}
	
}

