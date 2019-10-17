package l6_ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String op;
		Calculadora calc = new Calculadora();
		
		calc.setN1(entrada.nextInt());
		entrada.nextLine();
		op = entrada.nextLine();
		calc.setN2(entrada.nextInt());
		
		if (op.equals("+"))
			System.out.println(calc.soma());
		if (op.equals("-"))
			System.out.println(calc.subtracao());
		if (op.equals("*"))
			System.out.println(calc.multiplicacao());
		if (op.equals("/"))
			System.out.println(calc.divisao());
		
		entrada.close();
	}

}
