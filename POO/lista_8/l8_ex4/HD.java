package l8_ex4;

public class HD {
	
	private String marca;
	private String modelo;
	private float capacidade;
	private int rpm;
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public float getCapacidade() {
		return capacidade;
	}
	public int getRpm() {
		return rpm;
	}
	
	public void setMarca(String marca) {
		if(marca!="")
			this.marca = marca;
	}
	public void setModelo(String modelo) {
		if(modelo!="")
			this.modelo = modelo;
	}
	public void setCapacidade(float capacidade) {
		if(capacidade>0)
			this.capacidade = capacidade;
	}
	public void setRpm(int rpm) {
		if(rpm>0)
			this.rpm = rpm;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HD [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append(", rpm=");
		builder.append(rpm);
		builder.append("]");
		return builder.toString();
	}
	
}
