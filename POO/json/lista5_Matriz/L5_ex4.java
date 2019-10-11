package lista5_Matriz;

import java.util.Scanner;

public class L5_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		double primeiro=0, ultimo=Double.MAX_VALUE;
		
		System.out.print("Número de atletas: ");
		n = entrada.nextInt();
		double[][] saltos = new double[n][5];
		double[] media = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("\nAtleta "+(i+1));
			media[i]=0;
			for (int j=0; j<5; j++) {
				System.out.print("Salto "+(j+1)+": ");
				saltos[i][j] = entrada.nextDouble();
				media[i] = media[i]+saltos[i][j];
				if(j!=0)
					media[i] = media[i]/2;
				System.out.println("Média: "+media[i]+"\n");
			}
			if(media[i]>primeiro)
				primeiro = media[i];
			else if(media[i]<ultimo)
				ultimo = media[i];
		}
		
		System.out.println("-------------");
		
		for (int i=0; i<n; i++) {
			System.out.println("\nAtleta "+(i+1));
			for (int j=0; j<5; j++) {
				System.out.print("Salto "+(i+1)+": "+saltos[i][j]+"\n");
			}
			System.out.println("-> Média: "+media[i]);
		}
		
		System.out.println("\nMédia do 1º colocado: "+primeiro);
		System.out.println("Média do último colocado: "+ultimo);
		
		entrada.close();
	}

}
