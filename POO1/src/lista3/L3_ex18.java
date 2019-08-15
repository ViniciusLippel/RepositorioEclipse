package lista3;

import java.util.Scanner;
import java.util.ArrayList;

public class L3_ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		boolean primo = true;
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		
		System.out.print("Número: ");
		n = entrada.nextInt();
		
		for (int i=2; i<=n/2; i++) {
			if (n%i==0) {
				primo = false;
				divisores.add(i);
			}
		}
		
		if(primo)
			System.out.println("É primo");
		else {
			System.out.print("Não é primo. Divisores: ");
			System.out.print(divisores.get(0));
			for (int i=1; i<divisores.size(); i++)
				System.out.print(", "+divisores.get(i));
		}
		
		entrada.close();
	}

}
