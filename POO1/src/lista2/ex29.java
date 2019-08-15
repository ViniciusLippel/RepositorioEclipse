package lista2;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double litro;
		char tipo;
		
		System.out.print("Tipo: ");
		tipo = entrada.next().toUpperCase().charAt(0);
		System.out.print("Litro: ");
		litro = entrada.nextDouble();
		
		if(tipo=='A') {
			if(litro<=20)
				System.out.println("Preço: "+((litro*1.9)*0.97));
			else
				System.out.println("Preço: "+((litro*1.9)*0.95));
		}
		
		else if(tipo=='G') {
			if(litro<=20)
				System.out.println("Preço: "+((litro*2.5)*0.96));
			else
				System.out.println("Preço: "+((litro*2.5)*0.94));
		}
		
		entrada.close();
		
	}

}
