package lista2;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double n1, n2, media;
		
		System.out.print("1ª nota: ");
		n1 = entrada.nextDouble();
		
		System.out.print("2ª nota: ");
		n2 = entrada.nextDouble();
		
		media = (n1+n2)/2;
		
		if (media>=0 && media<3)
			System.out.println("Reprovado");
		else if (media>=3 && media<7)
			System.out.println("Em exame");
		else
			System.out.println("Aprovado");
		
		entrada.close();
	}

}
