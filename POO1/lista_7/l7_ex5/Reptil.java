package l7_ex5;

public class Reptil extends Animal {
	
	private double temperaturaSangue;
	
	public Reptil(double peso, String habitat, String tipoAlimentacao, double temperaturaSangue) {
		super(peso, habitat, tipoAlimentacao);
		this.setTemperaturaSangue(temperaturaSangue);
	}

	public double getTemperaturaSangue() {
		return temperaturaSangue;
	}

	public void setTemperaturaSangue(double temperaturaSangue) {
		if(temperaturaSangue>0)
			this.temperaturaSangue = temperaturaSangue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [temperaturaSangue=");
		builder.append(temperaturaSangue);
		builder.append("]");
		return builder.toString();
	}
	
	
}
