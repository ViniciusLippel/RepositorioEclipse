package persistencia;

import java.io.IOException;
import java.util.List;

public class Persistencia implements Gravacao{
	private Gravacao g;

	public Persistencia(Gravacao g) {
		this.g = g;
	}
	
	public void gravar(List<Pessoa> list) throws IOException {
		g.gravar(list);
	}
	
	public List<Pessoa> ler(){
		return g.ler();
	}
}
