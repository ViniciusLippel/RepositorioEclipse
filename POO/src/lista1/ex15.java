package lista1;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double area, latas;
		
		System.out.print("�rea a ser pintada (m�): ");
		area = entrada.nextDouble();
		
		latas = Math.ceil((area/3)/18); 
		
		System.out.printf("Ser�o necess�rias %.0f",(latas));
		System.out.println(" latas. Pre�o total: R$"+latas*80);
		
		entrada.close();
	}

}
