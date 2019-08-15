package ex3;

import java.util.Scanner;

public class Ex3 {
	
	private static int[] vetor = new int[10];
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void criarVetor() {
		System.out.println("Digite os números do vetor: ");
		for(int i=0; i<10; i++) {
			vetor[i] = entrada.nextInt();
		}
	}
	
	public static void mostrarVetor() {
		for(int i=0; i<10; i++) {
			System.out.println(Ex3.vetor[i]);
		}
	}
	
	public static void apresentarInverso() {
		for(int i=9; i>=0; i--) {
			System.out.println(Ex3.vetor[i]);
		}
	}
}
