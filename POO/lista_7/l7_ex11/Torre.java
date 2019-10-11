package l7_ex11;

public class Torre extends Peca {

	public Torre(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
		// TODO Auto-generated constructor stub
	}
	
	public boolean mover(int linha, int coluna) {
		boolean v = false;
		if ((linha>super.getLinha() || linha<super.getLinha()) ^ (coluna>super.getColuna() || coluna>super.getColuna())) {
			v = true;
			super.setColuna(coluna);
			super.setLinha(linha);
			super.setMovimentos(super.getMovimentos()+1);
		}
		return v;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Torre []");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
