package persistencia;

import java.io.IOException;
import java.util.List;

public interface Gravacao {

	public void gravar(List<Pessoa> list) throws IOException;
	public List<Pessoa> ler();
}
