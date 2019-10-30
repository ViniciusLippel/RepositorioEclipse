package collections;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainFila {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Queue<Cliente> clientes = new LinkedList<Cliente>();
		boolean menu = true;
		
		while(menu==true) {
			System.out.println("\nMENU \n1-Entrada \n2-Checar próximo \n3-Atender \n0-Sair");
			int x = entrada.nextInt();
			entrada.nextLine();
			
			if(x==1) {
				Cliente cli = new Cliente();
				System.out.print("Nome: ");
				cli.setNome(entrada.nextLine());
				System.out.print("CPF: ");
				cli.setCpf(entrada.nextLine());
				System.out.print("Tipo de atendimento: ");
				cli.setTipoAtendimento(entrada.nextLine());
				
				clientes.add(cli);
			}
			
			else if(x==2) {
				System.out.println("Próximo cliente: "+clientes.peek().getNome());
			}
			
			else if(x==3) {
				Date dt = new Date();
				System.out.println("Atender "+clientes.peek().getNome());
				clientes.peek().setHoraAtendimento(dt);
				clientes.remove();
			}
			
			else if(x==0)
				menu = false;
		}
		
		entrada.close();
	}
}
