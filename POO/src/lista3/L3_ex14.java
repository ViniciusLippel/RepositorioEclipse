package lista3;

import java.util.Scanner;

public class L3_ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Número: ");
		n = entrada.nextInt();
		
		
		for (int i=1; i<=n; i++) {
			if (i==1)
				System.out.print("S = "+1+"/"+1);
			else
				System.out.print(" + "+i+"/"+(i+(i-1)));
		}
		
		entrada.close();
		
	}

}
