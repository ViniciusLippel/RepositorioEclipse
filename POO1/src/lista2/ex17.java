package lista2;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double n1, n2, media;
		
		System.out.print("1ª nota: ");
		n1 = entrada.nextDouble();
		
		System.out.print("2ª nota: ");
		n2 = entrada.nextDouble();
		
		media = (n1+n2)/2;
		
		System.out.print("Aproveitamento: ");
		if (media>=9 && media<=10)
			System.out.println("A");
		else if (media>=7.5 && media<9)
			System.out.println("B");
		else if (media>=6 && media<7.5)
			System.out.println("C");
		else if (media>=4 && media<6)
			System.out.println("D");
		else if (media<4)
			System.out.println("E");
		
		entrada.close();
	}

}
