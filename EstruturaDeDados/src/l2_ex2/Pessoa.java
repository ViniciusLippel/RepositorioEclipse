package l2_ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
	
	Scanner entrada = new Scanner(System.in);

	private String nome;
	private String endereco;
	private String telefone;
	
	private ArrayList<String> nomes = new ArrayList<String>();
	private ArrayList<String> enderecos = new ArrayList<String>();
	private ArrayList<String> telefones = new ArrayList<String>();
	
	public void construct(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public void inserir() {
		nomes.add(this.nome);
		enderecos.add(this.endereco);
		telefones.add(this.telefone);
	}
	
	public void lerDados() {
		entrada.nextLine();
		System.out.print("\nNome: ");
		nome = entrada.nextLine();
		System.out.print("Endereço: ");
		endereco = entrada.nextLine();
		System.out.print("Telefone: ");
		telefone = entrada.nextLine();
		
		this.construct(nome, endereco, telefone);
	}
	
	public void escrever(int i) {
		System.out.println("\nNome: "+nomes.get(i));
		System.out.println("Endereço: "+enderecos.get(i));
		System.out.println("Telefone: "+telefones.get(i));
	}
	
	public void consultar() throws InterruptedException {
		System.out.print("\nConsultar pessoas (indice): ");
		int i = entrada.nextInt();
		if (i<nomes.size())
			this.escrever(i);
		else
			System.out.println("Pessoa inexistente");
		Thread.sleep(1000);
	}

}
