package lista2;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int a, b, c, delta, x1=0, x2=0;
		
		System.out.print("a: ");
		a = entrada.nextInt();
		if (a == 0)
			System.out.println("Esta n�o � uma equa��o de 2� grau");
		else {
			System.out.print("b: ");
			b = entrada.nextInt();
			System.out.print("c: ");
			c = entrada.nextInt();
			
			delta = (b*b)-(4*a*c);
			
			if (delta<0)
				System.out.println("Esta equa��o n�o possui valores reais");
			else {
				x1 = (int) (-b+(Math.sqrt(delta))/2*a);
				x2 = (int) (-b-(Math.sqrt(delta))/2*a);
			
				System.out.println("Raizes da equa��o: \nX' = "+x1+" \nX'' = "+x2);
			
				entrada.close();
			}
		}	
	}
}
