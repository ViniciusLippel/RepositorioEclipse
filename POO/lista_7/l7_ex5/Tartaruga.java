package l7_ex5;

public class Tartaruga extends Reptil {
	
	private double diametroCasco;
	
	public Tartaruga(double peso, String habitat, String tipoAlimentacao, double temperaturaSangue, double diametroCasco) {
		super(peso, habitat, tipoAlimentacao, temperaturaSangue);
		this.setDiametroCasco(diametroCasco);
	}

	public double getDiametroCasco() {
		return diametroCasco;
	}

	public void setDiametroCasco(double diametroCasco) {
		if(diametroCasco>0)
			this.diametroCasco = diametroCasco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [diametroCasco=");
		builder.append(diametroCasco);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
