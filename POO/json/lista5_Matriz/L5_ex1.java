package lista5_Matriz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class L5_ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n=0, soma=0, pares=0, impares=0, maior=0, menor=0, soma_dp=0, soma_ds=0, menu=0;
		double media=0;
		
			
		while (n<3 || n>11) {
			System.out.print("Número ímpar entre 3 e 11: ");
			n = entrada.nextInt();
			if ((n>=3 || n<=11) && n%2==0) {
				System.out.println("O número deve ser ímpar\n");
				n = 0;
			}
			else if (n<3 || n>11)
				System.out.println("O número deve estar entre 3 e 11\n");
		}
		
		int[][] matriz = new int[n][n];
		
		System.out.println("Valores das posições: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("m"+i+j+": ");
				matriz[i][j] = entrada.nextInt();
				int m = matriz[i][j];
				
				soma = soma + m;
				
				if (m%2==0)
					pares++;
				else
					impares++;
				
				if (i==j)
					soma_dp = soma_dp + m;
				
				if (i+j==n-1) 
					soma_ds = soma_ds + m;
				
				if (i==0 && j==0)
					menor = m;
				else if(m<menor)
					menor = m;
				else if (m>maior)
					maior = m;
			}
		}
		
		media = soma/(n*n);
		
		System.out.println("\nSoma: "+soma);
		System.out.println("Média: "+media);
		System.out.println("Pares: "+pares);
		System.out.println("Impares: "+impares);
		System.out.println("Soma diagona principal: "+soma_dp);
		System.out.println("Soma diagonal secundária: "+soma_ds);
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);

		System.out.println("Matriz: ");
		for (int i=0; i<n; i++) {
			System.out.print("|");
			for (int j=0; j<n; j++) {
				System.out.print(matriz[i][j]+"|");
			}
			System.out.println();
		}
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("arrayjson.json");
		writer.write(gson.toJson(matriz));
		writer.close();
		
		System.out.println("\n1- Ler arquivo Json \n2- Sair");
		menu = entrada.nextInt();
		if (menu==1) {
			String pegaJson = gson.toJson(matriz);
			
			int[][] matriz1 = new int[n][n];
			matriz1 = gson.fromJson(pegaJson, matriz1.getClass());
			
			System.out.print("\nValores digitados: ");
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++)
					System.out.print(matriz1[i][j]+"; ");
			}
		}
		
		entrada.close();
	}

}
