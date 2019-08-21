package lista5_Matriz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class L5_ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final int p=2;
		int n;
		double maior=0, menor=Double.MAX_VALUE, maiorMedia=0, menorMedia=Double.MAX_VALUE, mediaGeral=0;
		String maiorNome = null, menorNome = null, maiorMediaNome = null, menorMediaNome = null;
		
		System.out.print("Número de alunos: ");
		n = entrada.nextInt();
		
		String[] nome = new String[n];
		double[][] provas = new double[n][p];
		double[] medias = new double[n];
		
		System.out.println("Notas de cada aluno: ");
		for (int i=0; i<n; i++) {
			medias[i]=0;
			System.out.println("---\nAluno "+(i+1));
			System.out.print("Nome: ");
			nome[i] = entrada.nextLine();
			for (int j=0; j<p; j++) {
				System.out.println("Nota "+(i+1)+": ");
				provas[i][j] = entrada.nextDouble();
				double p1 = provas[i][j];
				
				medias[i] = medias[i]+p1;
					
				if(p1<menor) {
					menor = p1;
					menorNome = nome[i];
				}
				else if (p1>maior) {
					maior = p1;
					maiorNome = nome[i];
				}
			}
				
			medias[i] = medias[i]/p;
			mediaGeral = mediaGeral+medias[i];
			
			if (medias[i]>maiorMedia) {
				maiorMedia = medias[i];
				maiorMediaNome = nome[i];
			}
		}
		
		mediaGeral = mediaGeral/n;
		
		System.out.println("\nAlunos e suas notas: ");
		for (int i=0; i<n; i++) {
			System.out.println("---\n"+nome[i]+": ");
			for (int j=0; j<p; j++) {
				System.out.println("Nota "+(i+1)+": "+provas[i]);
			}
		}
		
		System.out.println("\nMédia de cada aluno: ");
		for (int i=0; i<n; i++) {
			System.out.println("---\n"+nome[i]+"\nMédia: "+medias[i]);
		}
		
		System.out.println("Maior nota: "+maior+", do aluno "+maiorNome);
		System.out.println("Menor nota: "+menor+", do aluno "+menorNome);
		
		System.out.println("Maior média: "+maiorMedia+", do aluno "+maiorMediaNome);
		System.out.println("Menor média: "+menorMedia+", do aluno "+menorMediaNome);
		
		System.out.println("Média Geral: "+mediaGeral);
		
		System.out.println("Alunos acima da media: ");
		for (int i=0; i<n; i++) {
			if (medias[i]>mediaGeral)
				System.out.println(nome[i]+"; ");
		}
		
		System.out.println("Alunos abaixo da media: ");
		for (int i=0; i<n; i++) {
			if (medias[i]<mediaGeral)
				System.out.println(nome[i]+"; ");
		}
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("arrayjson.json");
		writer.write(gson.toJson(provas));
		writer.close();
		
		System.out.println("\n1- Ler arquivo Json \n2- Sair");
		int menu = entrada.nextInt();
		if (menu==1) {
			String pegaJson = gson.toJson(provas);
			
			int[][] matriz1 = new int[n][p];
			matriz1 = gson.fromJson(pegaJson, matriz1.getClass());
			
			System.out.print("\nValores digitados: ");
			for (int i=0; i<n; i++) {
				for (int j=0; j<p; j++)
					System.out.print(matriz1[i][j]+"; ");
			}
		}
		
		entrada.close();
	}

}
