package l2_ex2;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	String nome;
	String endereco;
	String telefone;
	List<Pessoa> dado= new ArrayList<Pessoa>();
	
	Scanner entrada = new Scanner(System.in);
	
	public void addPessoa() {
		Pessoa dados = new Pessoa();
		dados.nome = entrada.nextLine();
		dados.endereco = entrada.nextLine();
		dados.telefone = entrada.nextLine();
		//JOptionPane.showMessageDialog(null,"Dados inseridos");
		dado.add(dados);
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.nome+"\nEndereço: "+this.endereco+"\nTelefone: "+this.telefone;
	}
	
	public void consulta() {
		for(Pessoa  info : dado) {
			System.out.println(info.toString());
		}
	}
	
}
