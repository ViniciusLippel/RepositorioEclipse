package lista3;

import java.util.Scanner;

public class L3_ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tabuada, comeco, fim;
		
		System.out.print("Montar tabuada de: ");
		tabuada = entrada.nextInt();
		System.out.print("Começar por: ");
		comeco = entrada.nextInt();
		System.out.print("Terminar em: ");
		fim = entrada.nextInt();
		
		if (comeco>fim) {
			System.out.println("\nVou montar a tabuada de "+tabuada+" começando em "+comeco+" e terminando em "+fim+": ");
			for (int i=comeco; i<=fim; i++) {
				System.out.println(tabuada+" x "+i+" = "+(tabuada*i));
			}
		}
		else
			System.out.println("O número inicial deve ser maior que o final.");
		
		entrada.close();
	}

}
