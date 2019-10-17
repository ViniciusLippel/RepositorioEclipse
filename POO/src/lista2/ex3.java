package lista2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		char l;
		
		System.out.print("Feminino ou Masculino: ");
		l = entrada.next().toUpperCase().charAt(0);
		
		if (l == 'F')
			System.out.println("Feminino");
		else if (l == 'M')
			System.out.println("Masculino");
		else
			System.out.println("Outro");
		
		entrada.close();
	}

}
