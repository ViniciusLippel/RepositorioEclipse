package trabalhoFinal;

public class Processo {
	private int indice;
	private String descricao;
	private Finalidade finalidade;
	private Processo proximo;
	
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
	public Finalidade getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(Finalidade finalidade) {
		this.finalidade = finalidade;
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
		builder.append("Processo [indice=");
		builder.append(indice);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", finalidade=");
		builder.append(finalidade);
		builder.append(", proximo=");
		builder.append(proximo);
		builder.append("]");
		return builder.toString();
	}
	
}
