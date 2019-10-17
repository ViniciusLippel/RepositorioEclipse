package lista3;

import java.util.Scanner;

public class L3_ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] n = new int[10];
		int par=0, impar=0;
		
		System.out.println("Digite 10 números: ");
		for (int i=0; i<10; i++) {
			n[i] = entrada.nextInt();
			if (n[i]%2==0)
				par++;
			else
				impar++;
		}
		
		System.out.println(par+" pares e "+impar+" impares.");
		
		entrada.close();
	}

}
