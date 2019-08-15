package lista1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double l, a;
		
		System.out.println("Digite o valor do lado do quadrado: ");
		l = entrada.nextDouble();
		
		a = l*l;
		
		System.out.println("Área do quadrado: "+a);
		
		entrada.close();
	}

}
