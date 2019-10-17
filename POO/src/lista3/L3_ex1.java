package lista3;

import java.util.Scanner;

public class L3_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double nota;
		
		do {
			System.out.print("Digite uma nota entre 0 e 10: ");
			nota = entrada.nextDouble();
		}while(nota<0 || nota>10);
		
		System.out.println("Nota: "+nota);
		
		entrada.close();
	}

}
