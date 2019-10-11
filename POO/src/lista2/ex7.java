package lista2;

import java.util.Arrays;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] n = new int[3];
		
		System.out.print("Digite três números: ");
		for (int i=0; i<3; i++)
			n[i] = entrada.nextInt();
		Arrays.sort(n);
		
		for(int i=2; i>=0; i--)
			System.out.println(n[i]);
		
		entrada.close();
	}

}
