package l8_ex3;

public class Banco {
	
	private int codigo;
	private String nome;
	private int numeroAgencias;
	
	public Banco(int codigo, String nome, int numeroAgencias) {
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setNumeroAgencias(numeroAgencias);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public int getNumeroAgencias() {
		return numeroAgencias;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumeroAgencias(int numeroAgencias) {
		this.numeroAgencias = numeroAgencias;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", numeroAgencias=");
		builder.append(numeroAgencias);
		builder.append("]");
		return builder.toString();
	}
	
}
