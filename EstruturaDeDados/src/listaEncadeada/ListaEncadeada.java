package listaEncadeada;

import java.util.Scanner;

public class ListaEncadeada {
	
	public Contato inicioLista = null;
	public Contato fimLista = null;
	
	public void menu() {
		Scanner entrada = new Scanner(System.in);
		int op;
		do {
			System.out.println("Menu");
			System.out.println("1- Inserir Contato");
			System.out.println("2- Listar Contatos");
			System.out.println("3- Pesquisar Contato");
			System.out.println("4- Excluir Contato");
			System.out.println("0- Sair");
			op = Integer.parseInt(entrada.nextLine());
			
			switch(op) {
			case 1:
				this.inserir();
				break;
			case 2:
				this.listar();
				break;
			case 3:
				this.pesquisar();
				break;
			case 4:
				this.excluir();
				break;
			case 0:
				System.out.println("Obrigado, volte sempre!");
				break;
			default:
				System.out.println("Opção inválida, tente novamente");
			}
		} while (op != 0);
	}
	
	public void inserir(String nome, long fone, String email) {
		Contato novo = new Contato();
		novo.setNome(nome);
		novo.setFone(fone);
		novo.setEmail(email);
		if(inicioLista == null) {
			inicioLista = novo;
		}
		else {
			fimLista.proximo = novo;
		}
		fimLista = novo;
	}
}
