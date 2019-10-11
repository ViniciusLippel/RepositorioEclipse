package lista1;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double met, cent;
		
		System.out.print("Digite o valor em metros: ");
		met = entrada.nextDouble();
		
		cent = met*100;
		
		System.out.println("Valor em centímetros: "+cent);
		
		entrada.close();
	}

}
