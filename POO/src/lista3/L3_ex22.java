package lista3;

import java.util.Scanner;

public class L3_ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n, maior=0, voto=0;
		String ganhador="";
		int[] c = new int[4];
		
		System.out.print("Número de votantes: ");
		n = entrada.nextInt();
		
		System.out.println("(1- c1 / 2- c2 / 3- c3)");
		for (int i=0; i<n; i++) {
			System.out.print((i+1)+"º eleitor: ");
			voto = entrada.nextInt();
			if (voto==1)
				c[0]++;
			else if (voto==2)
				c[1]++;
			else if (voto==3)
				c[2]++;
			else
				c[3]++;
		}
		
		System.out.println("\nNúmero de votos: ");
		for(int i=0; i<4; i++) {
			if (i==3)
				System.out.println("Nulos: "+c[i]);
			else
				System.out.println("Candidato "+(i+1)+": "+c[i]);
		}
		
		
		for (int i=0; i<3; i++) {
			if (c[i]>maior)
				ganhador = "Candidato "+(i+1);
		}
		
		System.out.println("Ganhador: "+ganhador);
		
		entrada.close();
		
		
	}

}
