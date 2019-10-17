package csv;

import java.io.IOException;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		ListaPessoa lp = new ListaPessoa();
		lp.setListaPessoa();
		
		Pessoa p = new Pessoa();
		p.setCodigo(1);
		p.setNome("vinicius");
		p.setEmail("viniciusmlipel@gmail.com");
		p.setTelefone("999090909");
		lp.incluir(p);
		
		Pessoa p1 = new Pessoa();
		p1.setCodigo(2);
		p1.setNome("vini");
		p1.setEmail("top");
		p1.setTelefone("999090909");
		lp.incluir(p1);
		
		lp.excluir(2);
	}

}
