package lista1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = entrada.nextInt();
		
		System.out.println("Soma dos dois números: "+(n1+n2));
		
		entrada.close();
	}

}
