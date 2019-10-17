package lista2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um valor: ");
		n = entrada.nextInt();
		
		if(n>0)
			System.out.println("Positivo");
		else if(n<0)
			System.out.println("Negativo");
		else
			System.out.println("O numero é zero");
		
		entrada.close();
	}

}
