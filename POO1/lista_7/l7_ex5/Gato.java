package l7_ex5;

public class Gato extends Mamifero {
	
	public Gato(double peso, String habitat, String tipoAlimentacao, String corPelos) {
		super(peso, habitat, tipoAlimentacao, corPelos);
	}

	public String miar() {
		return "miau";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato []");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
