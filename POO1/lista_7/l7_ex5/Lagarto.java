package l7_ex5;

public class Lagarto extends Reptil {

	public Lagarto(double peso, String habitat, String tipoAlimentacao, double temperaturaSangue) {
		super(peso, habitat, tipoAlimentacao, temperaturaSangue);
	}
	
	public boolean morder() {
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto []");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
