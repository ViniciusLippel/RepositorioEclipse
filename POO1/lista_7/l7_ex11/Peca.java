package l7_ex11;

public class Peca {
	
	private int linha;
	private int coluna;
	private boolean cor;
	private int movimentos;
	
	public Peca(int linha, int coluna, boolean cor, int movimentos) {
		super();
		this.linha = linha;
		this.coluna = coluna;
		this.cor = cor;
		this.movimentos = movimentos;
	}
	public int getLinha() {
		return linha;
	}
	public int getColuna() {
		return coluna;
	}
	public boolean isCor() {
		return cor;
	}
	public int getMovimentos() {
		return movimentos;
	}
	
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public void setCor(boolean cor) {
		this.cor = cor;
	}
	public void setMovimentos(int movimentos) {
		this.movimentos = movimentos;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peca [linha=");
		builder.append(linha);
		builder.append(", coluna=");
		builder.append(coluna);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", movimentos=");
		builder.append(movimentos);
		builder.append("]");
		return builder.toString();
	}
	
}
