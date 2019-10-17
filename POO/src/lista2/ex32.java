package lista2;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		char[] corretas = {'a','a','b','b','c','c','d','d','e','e'}, assi = new char[10];
		int soma=0;
		
		System.out.println("Gabarito:");
		for (int i=0; i<10; i++) {
			assi[i] = entrada.next().toLowerCase().charAt(0);
		}
		
		for(int i=0; i<10; i++) {
			System.out.print("Q"+(i+1)+": "+assi[i]);
			if(assi[i]==corretas[i]) {
				System.out.println(" V");
				soma++;
			}
			else
				System.out.println(" X -> ("+corretas[i]+")");
		}
		System.out.println("Pontuação final: "+soma);
		
		entrada.close();
	}

}
