package lista1;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double altura=0, pesoi=0;

		System.out.print("Altura: ");
		altura = entrada.nextDouble();
		
		pesoi = (72.7*altura) - 58;
		
		System.out.println("Peso ideal: "+pesoi);
		
		entrada.close();
	}

}
