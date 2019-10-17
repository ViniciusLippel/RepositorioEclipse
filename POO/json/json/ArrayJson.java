package json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArrayJson {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de valores: ");
		int t = entrada.nextInt();
		
		int[] vet = new int[t];
		
		for (int i = 0; i < t; i++) {
			System.out.print("->");
			vet[i] = entrada.nextInt();
		}
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("arrayjson.json");
		writer.write(gson.toJson(vet));
		writer.close();
		
		String pegaJson = gson.toJson(vet);
			
		int[] vet1 = new int[t];
		vet1 = gson.fromJson(pegaJson, vet1.getClass());
		
		System.out.print("\nValores digitados: ");
		for (int i=0; i<t; i++) {
			if (i!=0)
				System.out.print(", ");
			System.out.print(vet1[i]);
		}
		
		entrada.close();
		
	}
}