package l7_ex10;

public class BombaEtanol extends Bomba {

	public BombaEtanol(double totalLitros, float valorLitro) {
		super(totalLitros, valorLitro);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaEtanol []");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
