package listaEncadeada;

import java.util.Scanner;

public class ListaEncadeada {
	
	public Contato inicioLista = null;
	public Contato fimLista = null;
	
	public void menu() {
		Scanner entrada = new Scanner(System.in);
		int op;
		do {
			System.out.println("\nMenu");
			System.out.println("1- Inserir Contato");
			System.out.println("2- Listar Contatos");
			System.out.println("3- Pesquisar Contato");
			System.out.println("4- Excluir Contato");
			System.out.println("5- Inserir no meio da lista");
			System.out.println("6- Mostrar último registro");
			System.out.println("0- Sair");
			op = Integer.parseInt(entrada.nextLine());
			
			String nome, email;
			long fone;
			
			switch(op) {
			case 1:
				System.out.print("Nome: ");
				nome = entrada.nextLine();
				System.out.print("Telefone: ");
				fone = entrada.nextLong();
				entrada.nextLine();
				System.out.print("E-mail: ");
				email = entrada.nextLine();
				this.inserir(nome, fone, email);
				break;
			case 2:
				this.listar(inicioLista);
				break;
			case 3:
				System.out.print("Nome: ");
				this.pesquisar(entrada.nextLine(),inicioLista);
				break;
			case 4:
				//this.excluir();
				break;
			case 5:
				//this.inserirMeio();
				break;
			case 6:
				//this.ultimoRegistro();
				break;
			case 0:
				System.out.println("Obrigado, volte sempre!");
				break;
			default:
				System.out.println("Opção inválida, tente novamente");
			}
		} while (op != 0);
		
		entrada.close();
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
			fimLista.setProximo(novo);
		}
		fimLista = novo;
	}
	
	public void listar(Contato contato) {
		System.out.println(contato.toString());
		if(contato != fimLista) {
			contato = contato.getProximo();
			listar(contato);
		}
	}
	
	public void pesquisar(String pesquisa, Contato aux) {
		if(aux.getNome().compareTo(pesquisa)==0)
			System.out.println(aux.toString());
		else
			pesquisar(pesquisa, aux.getProximo());
	}
	
	public void excluir(String nome, Contato aux) {
		if(aux.getNome().compareTo(nome)==0)
			System.out.println(aux.toString());
		else
			excluir(nome, aux.getProximo());
	}
	
	public void inserirMeio() {
		
	}
	
	public void ultimoRegistro() {
		
	}
}
