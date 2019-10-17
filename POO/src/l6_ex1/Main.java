package l6_ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		NomeCompleto nomeComp = new NomeCompleto();
		
		nomeComp.setNome(entrada.nextLine());
		nomeComp.setSobrenome(entrada.nextLine());
		
		System.out.println(nomeComp.juntarNome());
		
		entrada.close();
	}

}
