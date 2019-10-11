package lista4_Vetor;

import java.util.Scanner;

public class L4_ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String texto;
		
		System.out.print("Digite um texto: ");
		texto = entrada.nextLine();
		
		
		String[] vetorTexto = texto.split("");
		
		for (int i=0; i<vetorTexto.length; i++)
			System.out.print(vetorTexto[i]+" / ");
		
		entrada.close();
	}

}
