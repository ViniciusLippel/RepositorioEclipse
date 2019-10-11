package lista1;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double peso,excedente,multa=0;
		
		System.out.print("Peso: ");
		peso = entrada.nextDouble();
		
		excedente = peso-50;
		
		if(excedente>0) {
			multa = excedente*4;
		}
		
		System.out.println("Excedente: "+excedente+"\nMulta: R$"+multa);
		
		entrada.close();
		
	}

}
