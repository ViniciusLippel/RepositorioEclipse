package lista1;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double area, latas;
		
		System.out.print("Área a ser pintada (m²): ");
		area = entrada.nextDouble();
		
		latas = Math.ceil((area/3)/18); 
		
		System.out.printf("Serão necessárias %.0f",(latas));
		System.out.println(" latas. Preço total: R$"+latas*80);
		
		entrada.close();
	}

}
