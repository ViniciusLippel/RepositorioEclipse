package l7_ex9;

public class MillenniumFalcon extends Apolo11 {
	
	private float classeHiperpropulsor;
	
	public MillenniumFalcon(double velocidadeMaxima, String tipoCombustivel, float classeHiperpropulsor) {
		super(velocidadeMaxima, tipoCombustivel);
		this.setClasseHiperpropulsor(classeHiperpropulsor);
	}

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		if(classeHiperpropulsor>0)
			this.classeHiperpropulsor = classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MillenniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
