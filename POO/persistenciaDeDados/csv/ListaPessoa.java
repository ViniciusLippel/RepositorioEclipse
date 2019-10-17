package csv;

import java.io.IOException;
import java.util.ArrayList;

public class ListaPessoa {

	private ArrayList<Pessoa> listaPessoa;

	public ArrayList<Pessoa> getListaPessoa() {
		return listaPessoa;
	}

	public void setListaPessoa() {
		this.listaPessoa = new ArrayList<Pessoa>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaPessoa [pessoas=");
		builder.append(listaPessoa);
		builder.append("]");
		return builder.toString();
	}
	
	public void incluir(Pessoa p) throws IOException {
		listaPessoa.add(p);
		PessoaCSV csv = new PessoaCSV();
		csv.gravar(listaPessoa);
	}
	
	public void alterar(Pessoa p) {
		for (Pessoa pessoa : listaPessoa) {
			if (pessoa == p) {
				 listaPessoa.remove(pessoa);
				 listaPessoa.add(p);
			}
		}
	}
	
	public void excluir(int codigo) throws IOException {
		for (Pessoa pessoa : listaPessoa) {
			if (pessoa.getCodigo() == codigo) {
				this.listaPessoa.remove(pessoa);
				break;
			}
		}
		PessoaCSV csv = new PessoaCSV();
		csv.gravar(listaPessoa);
	}
}
