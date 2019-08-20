package l2_ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	
	Scanner entrada = new Scanner(System.in);

	private String nome;
	private int anoNasc;
	private double renda;
	private double somaRenda=0;
	private int acimaMedia=0;
	private int entreAnos=0;
	
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
	
	public void lerDados() {
		entrada.nextLine();
		System.out.print("\nNome: ");
		nome = entrada.nextLine();
		System.out.print("Ano de nascimento: ");
		anoNasc = entrada.nextInt();
		System.out.print("Renda mensal: R$");
		renda = entrada.nextDouble();
		somaRenda = somaRenda+renda;
		
		this.construct(nome, anoNasc, renda);
	}
	
	public void escrever(int i) {
		System.out.println("\nNome: "+nomes.get(i));
		System.out.println("Ano de nascimento: "+anos.get(i));
		System.out.println("Renda mensal: R$"+rendas.get(i));
	}
	
	public void consultar() throws InterruptedException {
		System.out.print("\nConsultar cliente (indice): ");
		int i = entrada.nextInt();
		if (i<nomes.size())
			this.escrever(i);
		else
			System.out.println("Cliente inexistente");
		Thread.sleep(1000);
	}
	
	public int acimaMedia() {
		double media = somaRenda/rendas.size();
		for (int i=0; i<rendas.size(); i++) {
			if (rendas.get(i)>media)
				acimaMedia++;
		}
		return acimaMedia;
	}
	
	public int entreAnos() {
		for(int i=0; i<anos.size(); i++) {
			if (anos.get(i)>=1980 && anos.get(i)<=2000)
				entreAnos++;
		}
		return entreAnos;
	}


}
