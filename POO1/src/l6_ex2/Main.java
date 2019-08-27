package l6_ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Intervalo i = new Intervalo();
		
		i.setMenor(entrada.nextInt());
		i.setMaior(entrada.nextInt());

		System.out.println(i.gerarTxt());
		
		entrada.close();
	}

}
