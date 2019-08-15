package lista3;

import java.util.Scanner;

public class L3_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double a=80000, b=200000;
		int anos=0;
		
		while(b>=a) {
			a = a*1.03;
			b = b*1.015;
			anos++;
		}
		
		System.out.println("Anos: "+anos);
		
		entrada.close();
	}

}
