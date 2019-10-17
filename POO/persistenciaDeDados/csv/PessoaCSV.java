package csv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PessoaCSV {

	public void gravar(ArrayList<Pessoa> lista) throws IOException {
		FileWriter arq = new FileWriter("agenda.csv");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		for (Pessoa pessoa : lista) {
			gravarArq.printf("%d;%s;%s;%s\n",pessoa.getCodigo(),pessoa.getNome(),pessoa.getEmail(),pessoa.getTelefone());
		}
		
		arq.close();
	}
	
	public void ler() {
		
	}
}
