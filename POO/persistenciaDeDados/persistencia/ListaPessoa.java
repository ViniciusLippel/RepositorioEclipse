package persistencia;

import java.io.IOException;
import java.util.List;

public class ListaPessoa {

	private List<Pessoa> listaPessoa;

	public List<Pessoa> getListaPessoa() {
		return listaPessoa;
	}

	public void setListaPessoa(List<Pessoa> list) {
		this.listaPessoa = list;
	}
	
	public void incluir(Pessoa p) throws IOException {
		listaPessoa.add(p);
	}
	
	public void alterar(Pessoa p) {
		for (Pessoa pessoa : listaPessoa) {
			if (pessoa.getCodigo() == p.getCodigo()) {
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
	}
	
	public String pesquisarNome(String nome) {
		String txt = "";
		for (Pessoa pessoa : listaPessoa) {
			if (pessoa.getNome().compareTo(nome)<pessoa.getNome().length())
				txt = txt+pessoa.getNome()+"; ";
		}
		return txt;
	}
}
