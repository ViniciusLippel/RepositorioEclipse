package lista4_Vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class L4_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] vetor = new String[10];
		int consoante=0;
		ArrayList<String> cons = new ArrayList<String>();
		
		System.out.println("Digite 10 caracteres: ");
		for (int i=0; i<10; i++) {
			System.out.print("-> ");
			vetor[i] = entrada.nextLine().substring(0);
			
			if (!vetor[i].equalsIgnoreCase("a") && !vetor[i].equalsIgnoreCase("e") && !vetor[i].equalsIgnoreCase("i") && !vetor[i].equalsIgnoreCase("o") && !vetor[i].equalsIgnoreCase("u")) {
				consoante++;
				cons.add(vetor[i]);
			}
		}
		
		System.out.println("Numero de consoantes: "+consoante);
		for (int i=0; i<cons.size(); i++) {
			System.out.print(cons.get(i)+"; ");
		}
		
		entrada.close();
	}

}
