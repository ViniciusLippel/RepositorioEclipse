package lista2;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int l1, l2, l3;
		
		System.out.println("Digite os tr�s lados do ti�ngulo: ");
		l1 = entrada.nextInt();
		l2 = entrada.nextInt();
		l3 = entrada.nextInt();
		
		if (l1+l2>l3 && l1+l3>l2 && l2+l3>l1) {
			if(l1==l2 && l1==l3)
				System.out.println("Equil�tero");
			else if(l1==l2 || l1==l3 || l2==l3)
				System.out.println("Is�sceles");
			else 
				System.out.println("Escaleno");
		}
		else
			System.out.println("N�o se pode formar um tri�nugulo com estes valores");
		
		entrada.close();
	}

}
