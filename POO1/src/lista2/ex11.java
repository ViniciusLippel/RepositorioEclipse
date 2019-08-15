package lista2;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		char t;
		
		System.out.println("Turno (M, V ou N): ");
		t = entrada.next().toUpperCase().charAt(0);
		
		if (t=='M')
			System.out.println("Bom dia!");
		else if (t=='V')
			System.out.println("Boa tarde!");
		else if (t=='N')
			System.out.println("Boa noite!");
		else
			System.out.println("Turno inválido");
		
		entrada.close();
	}

}
