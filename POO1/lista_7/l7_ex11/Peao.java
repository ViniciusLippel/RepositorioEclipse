package l7_ex11;

public class Peao extends Peca {

	public Peao(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
		// TODO Auto-generated constructor stub
	}
	
	public boolean mover(int linha, int coluna) {
		boolean v = false;
		if(super.getMovimentos()==0 && (linha==super.getLinha()+2 || linha==super.getLinha()+1) && (coluna==super.getColuna())){
			v = true;
			super.setColuna(coluna);
			super.setLinha(linha);
			super.setMovimentos(super.getMovimentos()+1);
		}
		else if(linha==super.getLinha()+1 && coluna==super.getColuna()) {
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
		builder.append("Peao []");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
