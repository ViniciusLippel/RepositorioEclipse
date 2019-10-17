package l7_ex10;

public class BombaGasolina extends Bomba {

	public BombaGasolina(double totalLitros, float valorLitro) {
		super(totalLitros, valorLitro);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaGasolina []");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
