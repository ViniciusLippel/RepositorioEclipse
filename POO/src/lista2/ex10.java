package lista2;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int ma=0, me=0;
		int[] n = new int[3];
		
		System.out.println("Digite três números");
		for (int i=0; i<3; i++) {
			n[i] = entrada.nextInt();
			if (i==0)
				me = n[i];
			else if (n[i]<me)
				me = n[i];
			
			if (n[i]>ma)
				ma = n[i];
		}
		
		System.out.println("Maior: "+ma);
		System.out.println("Menor: "+me);
		
		entrada.close();
	}

}
