package l6_ex5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Salario sal = new Salario();
		
		sal.setGanho(entrada.nextDouble());
		sal.setHoras(entrada.nextDouble());
		
		System.out.println(sal.toString());
		
		entrada.close();
	}

}
