package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CSV implements Gravacao{

	public void gravar(List<Pessoa> lista) throws IOException {
		FileWriter arq = new FileWriter("agenda.csv");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		for (Pessoa pessoa : lista) {
			gravarArq.printf("%d;%s;%s;%s;%s\n",pessoa.getCodigo(),pessoa.getNome(),pessoa.getEmail(),pessoa.getTelefone(),pessoa.getDataNasc());
		}
		
		arq.close();
	}
	
	public List<Pessoa> ler() {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		try {
			FileReader arq1 = new FileReader("agenda.csv");
			BufferedReader lerArq = new BufferedReader(arq1);
			String linha = lerArq.readLine();
			while (linha != null) {
				String[] leitura = linha.split(";");
				Pessoa p = new Pessoa();
				p.setCodigo(Integer.parseInt(leitura[0]));
				p.setNome(leitura[1]);
				p.setEmail(leitura[2]);
				p.setTelefone(leitura[3]);
				Date dt = new Date();
				try {
					dt.setTime(Long.parseLong(leitura[4]));
					System.out.println(dt.getTime());
					p.setDataNasc(dt);
				}catch(Exception e){
					e.printStackTrace();
				}
				lista.add(p);
				linha = lerArq.readLine();
			}
			arq1.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		return lista;
	}
}
