package collections;

import java.util.Date;

public class Contato{

	private String nome;
	private String telefone;
	private String email;
	private Date dataNasc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	
//	@Override
//	public int compareTo(Contato outroContato) {
//		if(this.nome.compareTo(outroContato.getNome())<0) {
//			return -1;
//		}
//		else if(this.nome.compareTo(outroContato.getNome())>0) {
//			return 1;
//		}
//		return 0;
//	}
	
	
}
