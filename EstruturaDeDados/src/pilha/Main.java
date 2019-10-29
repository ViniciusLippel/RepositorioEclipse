package pilha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean loop = true;
		Pilha tarefas = new Pilha();
		
		while(loop) {
			System.out.println("\nMENU \n1- Inserir tarefa \n2- Obter próxima tarefa \n3- sair");
			int menu = entrada.nextInt();
			entrada.nextLine();
			if(menu == 1) {
				tarefas.add(entrada.nextLine());
			}
			else if(menu == 2) {
				System.out.println(tarefas.proxima().getDescricao());
			}
			else if(menu == 3) {
				loop = false;
			}
		}
		entrada.close();
	}

}
