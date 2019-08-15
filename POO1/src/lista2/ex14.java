package lista2;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] dia = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabádo"};
		int n;
		
		System.out.print("Digite um número: ");
		n = entrada.nextInt();
		
		System.out.println(dia[n-1]);
		
		entrada.close();
	}

}
