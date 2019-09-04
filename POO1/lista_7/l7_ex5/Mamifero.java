package l7_ex5;

public class Mamifero extends Animal {
	
	private String corPelos;
	
	public Mamifero(double peso, String habitat, String tipoAlimentacao, String corPelos) {
		super(peso, habitat, tipoAlimentacao);
		this.setCorPelos(corPelos);
	}

	public String getCorPelos() {
		return corPelos;
	}

	public void setCorPelos(String corPelos) {
		this.corPelos = corPelos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [corPelos=");
		builder.append(corPelos);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
