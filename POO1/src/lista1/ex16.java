package lista1;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double area, latas1, latas2;
		
		System.out.print("Área a ser pintada (m²): ");
		area = entrada.nextDouble();
		
		latas1 = Math.ceil((area/6)/18);
		
		latas2 = Math.ceil((area/6)/3.6); 
		
		System.out.printf("%.0f",(latas1));
		System.out.println(" latas de 18 litros. Preço total: R$"+latas1*80);
		System.out.printf("Ou %.0f",(latas2));
		System.out.println(" latas de 3,6 litros. Preço total: R$"+latas2*25);
		
		entrada.close();
	}

}
