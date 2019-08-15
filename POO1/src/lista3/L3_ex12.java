package lista3;

import java.util.Scanner;

public class L3_ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int qtd, fibo = 1, aux1 = 0, aux2 = 0;
		
		System.out.print("Tamanho da sequência fibonacci: ");
		qtd = entrada.nextInt();
		
		for(int i=0; i<qtd; i++) {
			System.out.print(fibo+", ");
			aux2 = fibo;
			fibo = fibo+aux1;
			aux1 = aux2;
		}
		
		entrada.close();
	}

}
