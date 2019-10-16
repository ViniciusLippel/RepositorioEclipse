package listaEncadeada;

public class Contato {

	private String nome;
	private long fone;
	private String email;
	private Contato proximo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getFone() {
		return fone;
	}
	public void setFone(long fone) {
		this.fone = fone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Contato getProximo() {
		return proximo;
	}
	public void setProximo(Contato proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [nome=");
		builder.append(nome);
		builder.append(", fone=");
		builder.append(fone);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
}
