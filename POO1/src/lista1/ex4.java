package lista1;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3, nota4;
		
		System.out.println("Digite as 4 notas do aluno: ");
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		nota3 = entrada.nextDouble();
		nota4 = entrada.nextDouble();
		
		System.out.println("Média: "+((nota1+nota2+nota3+nota4)/4));
		
		entrada.close();
	}

}
