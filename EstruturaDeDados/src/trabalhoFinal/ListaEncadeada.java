package trabalhoFinal;

import java.util.Scanner;

public class ListaEncadeada {
	
	private Contato inicioLista = null;
	private Contato fimLista = null;
	
	public Contato getInicioLista() {
		return inicioLista;
	}

	public void setInicioLista(Contato inicioLista) {
		this.inicioLista = inicioLista;
	}

	public Contato getFimLista() {
		return fimLista;
	}

	public void setFimLista(Contato fimLista) {
		this.fimLista = fimLista;
	}

	public int menu() {
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
				System.out.println("Nome: ");
				this.excluir(entrada.nextLine(),inicioLista);
				break;
			case 5:
				//this.inserirMeio();
				System.out.println(tamanho(0, inicioLista));
				break;
			case 6:
				System.out.println(this.ultimoRegistro(inicioLista));
				break;
			case 0:
				System.out.println("Obrigado, volte sempre!");
				break;
			default:
				System.out.println("Opção inválida, tente novamente");
			}
		} while (op != 0);
		
		entrada.close();
		return op;
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
		if(aux.getNome().compareTo(pesquisa)<=aux.getNome().length())
			System.out.println(aux.toString());
		if (aux.getProximo()!=null)
			pesquisar(pesquisa, aux.getProximo());
	}
	
	public void excluir(String nome, Contato aux) {
		if(aux.getProximo().getNome().compareTo(nome)==0) {
			if (aux.getProximo()==fimLista)
				fimLista = aux;
			aux.setProximo(aux.getProximo().getProximo());
		}
		else if (aux.getNome().compareTo(nome)==0)
			inicioLista = aux.getProximo();
		else
			excluir(nome, aux.getProximo());
	}
	
	public int tamanho(int i, Contato aux) {
		i = 1;
		if (aux.getProximo()!=null) {
			i = i+tamanho(i, aux.getProximo());
			return i;
		}
		else
			return 1;
	}
	
	public void inserirMeio() {
		
	}
	
	public Contato ultimoRegistro(Contato contato) {
		if (contato.getProximo() != null)
			return ultimoRegistro(contato.getProximo());
		else
			return contato;
	}
}
