package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainLista {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Contato> contatos = new ArrayList<Contato>();
		Contato c = new Contato();
		boolean menu = true;
		
		while(menu==true) {
			System.out.println("MENU \n1-Inserir \n2-Inserir em posição \n3-Remover \n4-Remover em posição"
					+ "\n5-Ordenar inversa \n0-Sair");
			int x = entrada.nextInt();
			entrada.nextLine();
			
			if(x==1 || x==2) {
				System.out.println("Nome: ");
				c.setNome(entrada.nextLine());
				System.out.println("Email: ");
				c.setEmail(entrada.nextLine());
				System.out.println("Telefone: ");
				c.setTelefone(entrada.nextLine());
				
				if(x==1)
					contatos.add(c);
				else {
					System.out.println("Indice: ");
					contatos.add(entrada.nextInt(),c);
				}
			}
			
			else if(x==3)
				contatos.remove(c);
			
			else if(x==4) {
				System.out.println("Indice: ");
				contatos.remove(entrada.nextInt());
			}
			
			else if(x==5)
				Collections.reverse(contatos);
			
			else if(x==0)
				menu=false;
		}
		
		entrada.close();
	}
}
