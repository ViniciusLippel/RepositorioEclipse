package lista1;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		double n3;
		
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextDouble();
		
		System.out.println("a: "+((n1*2)/(n2/2)));
		System.out.println("b: "+(n1*3+n3));
		System.out.println("c: "+(Math.pow(n3, 3)));
		
		entrada.close();
	}

}
