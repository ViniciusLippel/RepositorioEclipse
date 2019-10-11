package lista2;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		char l;
		
		System.out.print("Digite uma letra: ");
		l = entrada.next().toLowerCase().charAt(0);
		
		if (l=='a' || l=='e' || l=='i' || l=='o' || l=='u')
			System.out.println("É vogal");
		else
			System.out.println("É consoante");
		
		entrada.close();
	}

}
