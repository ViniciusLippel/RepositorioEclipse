package lista4_Vetor;

import java.util.Scanner;

public class L4_ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String palavras;
		
		System.out.print("Digite palavras separadas por ; : ");
		palavras = entrada.nextLine();
		
		
		String[] vetorPalavras = palavras.split(";");
		
		for (int i=0; i<vetorPalavras.length; i++)
			System.out.print(vetorPalavras[i]+" / ");
		
		entrada.close();
	}

}
