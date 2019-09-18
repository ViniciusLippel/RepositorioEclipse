package projetoURL;

import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {
		
		Pessoa p = new Pessoa();
		System.out.println("Buscando dados...");
		p = ExtratorURL.URI("https://www.urionlinejudge.com.br/judge/pt/profile/404");
		System.out.println(p);
		
	}
	
}
