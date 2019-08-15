package lista2;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int ano;
		
		System.out.print("Digite o ano: ");
		ano = entrada.nextInt();
		
		if ((ano%4 == 0 && ano%100 != 0) || (ano%100==0 && ano%400==0))
				System.out.println("É ano bissexto");
		else
			System.out.println("Não é ano bissexto");
		
		entrada.close();
	}

}
