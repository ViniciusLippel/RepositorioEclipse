package l2_ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	
	Scanner entrada = new Scanner(System.in);

	private String nome;
	private int anoNasc;
	private double renda;
	private ArrayList<String> nomes = new ArrayList<String>();
	private ArrayList<Integer> anos = new ArrayList<Integer>();
	private ArrayList<Double> rendas = new ArrayList<Double>();
	
	public void construct(String nome, int anoNasc, double renda) {
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.renda = renda;
	}
	
	public void inserir() {
		nomes.add(this.nome);
		anos.add(this.anoNasc);
		rendas.add(this.renda);
	}
	
	public void addDados() {
		System.out.print("Nome: ");
		nome = entrada.nextLine();
		System.out.print("Ano de nascimento: ");
		anoNasc = entrada.nextInt();
		System.out.print("Renda mensal: ");
		renda = entrada.nextDouble();
		
		this.construct(nome, anoNasc, renda);
	}
	
	public void consultar(int i) {
		System.out.println("Nome: "+nomes.get(i));
		System.out.println("Ano de nascimento: "+anos.get(i));
		System.out.println("Renda mensal: "+rendas.get(i));
	}
	
	public void consultar2() {
		System.out.println(this);
	}

}
