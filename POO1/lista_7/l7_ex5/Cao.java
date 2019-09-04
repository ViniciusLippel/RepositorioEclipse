package l7_ex5;

public class Cao extends Mamifero {

	public Cao(double peso, String habitat, String tipoAlimentacao, String corPelos) {
		super(peso, habitat, tipoAlimentacao, corPelos);
	}
	
	public String latir() {
		return "Au Au";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cao []");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
