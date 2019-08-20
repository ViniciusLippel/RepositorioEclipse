package l2_ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int menu = 0;
		
		Cliente pessoa = new Cliente();
		
		while (menu!=3) {
			System.out.println("\nMENU \n1- Inserir Cliente. \n2- Consultar Clientes. \n3- Sair");
			menu = entrada.nextInt();
			
			if (menu==1) {
				
				pessoa.lerDados();
				pessoa.inserir();
			}
			
			else if (menu==2)
				pessoa.consultar();
			
		}
		
		System.out.println("\nN�mero de clientes com renda acima da m�dia: "+pessoa.acimaMedia());
		System.out.println("N�mero de clientes nascidos entre 1980 e 2000: "+pessoa.entreAnos());
		
		entrada.close();
			
	}

}
