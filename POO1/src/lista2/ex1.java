package lista2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = entrada.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		n2 = entrada.nextInt();
		
		if (n1>n2) 
			System.out.println("Maior: "+n1);
		
		else if (n2>n1)
			System.out.println("Maior: "+n2);
		
		else
			System.out.println("Os dois n�meros s�o iguais");
		
		entrada.close();
	}

}
