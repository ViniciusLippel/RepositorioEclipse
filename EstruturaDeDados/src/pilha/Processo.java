package pilha;

public class Processo {
	public int indice;
	public String descricao;
	public Processo proximo;
	
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Processo getProximo() {
		return proximo;
	}
	public void setProximo(Processo proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tarefa [indice=");
		builder.append(indice);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", proximo=");
		builder.append(proximo);
		builder.append("]");
		return builder.toString();
	}
	
}
