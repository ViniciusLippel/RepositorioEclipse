package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		Pessoa p = new Pessoa();
		p.setCodigo(1);
		p.setNome("Rodrigo");
		p.setEmail("blzblz@gmail.com");
		lista.add(p);
		
		p = new Pessoa();
		p.setCodigo(2);
		p.setNome("Angelo");
		lista.add(p);
		
		p = new Pessoa();
		p.setCodigo(5);
		p.setNome("Vinicius");
		// Colocar data certa
		Date dt = new Date();
		p.setDataNasc(dt);
		lista.add(p);
		
		CSV csv = new CSV();
		XML xml = new XML();
		Json json = new Json();
		Persistencia per = new Persistencia (json);
		per.gravar(lista);
		List<Pessoa> lista1 = per.ler();
		
		for (Pessoa pessoa : lista1)
			System.out.println(pessoa.toString());
		
	}
}
