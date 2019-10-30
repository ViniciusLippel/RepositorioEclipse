package collections;

import java.util.Scanner;
import java.util.Stack;

public class MainCorrespondecia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Stack<Correspondencia> expresso = new Stack<Correspondencia>();
		Stack<Correspondencia> normal = new Stack<Correspondencia>();
		boolean menu = true;
		
		while(menu==true) {
			System.out.println("\nMENU \n1-Inserir correspondência \n2-Entregar \n3-Verificar próxima "
					+ "\n4-Número de correspondencias \n0-Sair");
			int x = entrada.nextInt();
			entrada.nextLine();
			
			if(x==1) {
				int y = 0;
				Correspondencia c = new Correspondencia();
				System.out.print("Destinatário: ");
				c.setDestinatario(entrada.nextLine());
				System.out.print("Rua: ");
				c.setRua(entrada.nextLine());
				System.out.print("Número: ");
				c.setNumero(entrada.nextInt());
				entrada.nextLine();
				System.out.print("Bairro: ");
				c.setBairro(entrada.nextLine());
				System.out.print("Cidade: ");
				c.setCidade(entrada.nextLine());
				System.out.print("CEP: ");
				c.setCep(entrada.nextLine());
				while(y!=1 && y!=2) {
					System.out.println("Tipo de envio: \n1-Expresso \n2-Normal");
					y = entrada.nextInt();
					entrada.nextLine();
					if(y==1)
						expresso.push(c);
					else if(y==2)
						normal.push(c);
				}
			}
			
			
			else if(x==2) {
				System.out.print("Entregando ");
				if(expresso.size()!=0) {
					System.out.println(expresso.peek().toString());
					expresso.pop();
				}
				else if(normal.size()!=0) {
					System.out.println(normal.peek().toString());
					normal.pop();
				}
				else
					System.out.println("Sacola vazia");
			}
			
			else if(x==3) {
				System.out.print("Próxima correspondência: ");
				if(expresso.size()!=0)
					System.out.println(expresso.peek().toString());
				else if(normal.size()!=0)
					System.out.println(normal.peek().toString());
				else
					System.out.println("Sacola vazia");
			}
			
			else if(x==4)
				System.out.println(expresso.size()+normal.size());
			
			else if(x==0)
				menu = false;
		}
		
		entrada.close();
	}

}
