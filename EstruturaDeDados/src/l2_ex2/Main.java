package l2_ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int menu = 0;
		
		Pessoa pessoa = new Pessoa();
		
		while (menu!=3) {
			System.out.println("\nMENU \n1- Inserir Pessoa. \n2- Consultar Pessoas. \n3- Sair");
			menu = entrada.nextInt();
			
			if (menu==1) {
				
				pessoa.lerDados();
				pessoa.inserir();
			}
			
			else if (menu==2)
				pessoa.consultar();
			
		}
		
		entrada.close();
			
	}

}
