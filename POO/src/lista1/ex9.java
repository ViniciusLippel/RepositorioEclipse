package lista1;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double f,c;
		
		System.out.println("Fahrenheit: ");
		f = entrada.nextDouble();
		
		c = 5*(f-32)/9;
		
		System.out.println("Celsius: "+c+"ºC");
		
		entrada.close();
	}

}
