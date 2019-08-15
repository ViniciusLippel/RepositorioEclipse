package lista2;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double altura=0, peso=0, pesoi=0;
		char sexo=' ';
		
		System.out.print("Altura: ");
		altura = entrada.nextDouble();
		
		System.out.print("Peso: ");
		peso = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.print("Sexo (M ou F): ");
		sexo = entrada.next().toUpperCase().charAt(0);
		
		if (sexo=='F')
			pesoi = (62.1*altura) - 44.7;
		else if (sexo=='M')
			pesoi = (72.7*altura) - 58;
		else
			System.out.println("Sexo inválido");
		
		System.out.println("Altura: "+altura+"\nPeso: "+peso+"\nSexo: "+sexo+"\nPeso ideal: "+pesoi);
		if (peso>pesoi)
			System.out.println("Está acima do peso");
		else if (peso<pesoi)
			System.out.println("Está abaixo do peso");
		else
			System.out.println("Está no peso ideal");
		
		entrada.close();
	}

}
