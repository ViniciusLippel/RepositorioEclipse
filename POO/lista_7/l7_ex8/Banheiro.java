package l7_ex8;

public class Banheiro extends Ambiente {
	
	private boolean banheira;
	
	public Banheiro(float area, boolean banheira) {
		super(area);
		this.setBanheira(banheira);
	}

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banheiro [banheira=");
		builder.append(banheira);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
