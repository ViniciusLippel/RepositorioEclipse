package ex2;

import java.util.Scanner;

public class Cpf {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static int lerCpf() {
		int cpf = entrada.nextInt();
		return cpf;
	}
	
	public static void verificarCpf(int cpf) {
		
		char[] vetor = Integer.toString(cpf).toCharArray();
		int[] unidade = new int[vetor.length];
		                        
		for (int i=0; i<vetor.length; i++) {
			unidade[i] = Character.getNumericValue(vetor[i]);
		}
		
		
	}
	
}
