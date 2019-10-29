package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainFila {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Queue<Cliente> clientes = new LinkedList<Cliente>();
		Contato c = new Contato();
		boolean menu = true;
		
		while(menu==true) {
			System.out.println("MENU \n1-Entrada \n2-Checar próximo \n3-Atender \n0-Sair");
			int x = entrada.nextInt();
			entrada.nextLine();
		}
	}
}
