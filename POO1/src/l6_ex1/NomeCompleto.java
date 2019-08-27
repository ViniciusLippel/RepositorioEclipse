package l6_ex1;

public class NomeCompleto {
	
	private String nome;
	private String sobrenome;
	

	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String juntarNome() {
		StringBuilder builder = new StringBuilder();
		builder.append("Seu nome completo é: ");
		builder.append(this.nome);
		builder.append(" ");
		builder.append(this.sobrenome);
		return builder.toString();
	}
}
