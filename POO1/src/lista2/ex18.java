package lista2;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int l1, l2, l3;
		
		System.out.println("Digite os três lados do tiângulo: ");
		l1 = entrada.nextInt();
		l2 = entrada.nextInt();
		l3 = entrada.nextInt();
		
		if (l1+l2>l3 && l1+l3>l2 && l2+l3>l1) {
			if(l1==l2 && l1==l3)
				System.out.println("Equilátero");
			else if(l1==l2 || l1==l3 || l2==l3)
				System.out.println("Isósceles");
			else 
				System.out.println("Escaleno");
		}
		else
			System.out.println("Não se pode formar um triânugulo com estes valores");
		
		entrada.close();
	}

}
