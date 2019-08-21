package lista5_Matriz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class L5_ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final int mercados = 5, produtos = 5;
		double [][] precos = new double[mercados][produtos];
		double[] somaM = new double[mercados], somaP = new double[produtos];
		double maior=0, menor=Double.MAX_VALUE;
		
		for (int i=0; i<produtos; i++)
			somaP[i]=0;
		
		for (int i=0; i<mercados; i++) {
			System.out.println("Mercado "+(i+1));
			somaM[i] = 0;
			for (int j=0; j<produtos; j++) {
				System.out.print("produto"+(j+1)+": R$");
				precos[i][j] = entrada.nextInt();
				double p = precos[i][j];
				somaM[i] = somaM[i]+p;
				somaP[j] = somaP[j]+p;
			}
		}
		
		for (int i=0; i<mercados; i++) {
			if (somaM[i]>maior) 
				maior = somaM[i];
			else if (somaM[i]<menor)
				menor = somaM[i];
		}
		
	
		
		System.out.println("\nPreços em cada supermercado: ");
		for (int i=0; i<mercados; i++) {
			System.out.println("\n-----\nMercado: "+(i+1));
			for (int j=0; j<produtos; j++) {
				System.out.println("Produto "+(j+1)+": R$"+precos[i][j]);
			}
		}
		System.out.println("\nMédia por produto: ");
		for (int i=0; i<produtos; i++)
			System.out.println("\n-----\nProduto "+(i+1)+": R$"+somaP[i]/mercados);
		
		System.out.println("\nSoma de preços por supermercado: ");
		for (int i=0; i<mercados; i++)
			System.out.println("\n-----\nMercado "+(i+1)+": "+somaM[i]);
		
		System.out.println("\nValor do mercado mais barato: "+menor);
		System.out.println("Valor do mercado mais caro: "+maior);
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("arrayjson.json");
		writer.write(gson.toJson(precos));
		writer.close();
		
		System.out.println("\n1- Ler arquivo Json \n2- Sair");
		int menu = entrada.nextInt();
		if (menu==1) {
			String pegaJson = gson.toJson(precos);
			
			int[][] matriz1 = new int[mercados][produtos];
			matriz1 = gson.fromJson(pegaJson, matriz1.getClass());
			
			System.out.print("\nValores digitados: ");
			for (int i=0; i<mercados; i++) {
				for (int j=0; j<produtos; j++)
					System.out.print(matriz1[i][j]+"; ");
			}
		}
		
		entrada.close();

	}

}
