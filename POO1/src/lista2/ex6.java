package lista2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um n�mero: ");
		n = entrada.nextInt();
		
		n = n+1;
		
		if(n%2==0)
			System.out.println("O n�mero era �mpar, agora � par: "+n);
		else
			System.out.println("O n�mero era par, agora � impar: "+n);
		
		entrada.close();
	}

}
