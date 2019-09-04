package l7_ex7;

public class Pessoa {
	
	private int codigo;
	private String nome;
	private String endereco;
	
	public Pessoa(int codigo, String nome, String endereco) {
		super();
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setEndereco(endereco);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	
	public void setCodigo(int codigo) {
		if(codigo>0)
			this.codigo = codigo;
	}
	public void setNome(String nome) {
		if(nome!="")
			this.nome = nome;
	}
	public void setEndereco(String endereco) {
		if(endereco!="")
			this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
}
