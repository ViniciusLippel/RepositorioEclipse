package trabalhoFinal;

public class Funcionario {
	private String nome;
	private String telefone;
	private Funcionario proximo;
	
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
	public Funcionario getProximo() {
		return proximo;
	}
	public void setProximo(Funcionario proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [nome=");
		builder.append(nome);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append(", proximo=");
		builder.append(proximo);
		builder.append("]");
		return builder.toString();
	}
	
	public String toStringSimple() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [nome=");
		builder.append(nome);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append("]");
		return builder.toString();
	}
	
	
}
