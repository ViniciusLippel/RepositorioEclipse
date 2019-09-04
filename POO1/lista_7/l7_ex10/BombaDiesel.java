package l7_ex10;

public class BombaDiesel extends Bomba {

	public BombaDiesel(double totalLitros, float valorLitro) {
		super(totalLitros, valorLitro);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaDiesel []");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
