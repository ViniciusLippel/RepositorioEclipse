package lista1;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double raio, area;
		
		System.out.print("Digite o raio do c�rculo: ");
		raio = entrada.nextDouble();
		
		area = 3.14*raio*raio;
		
		System.out.println("�rea do c�rculo: "+area);
		
		entrada.close();
	}

}
