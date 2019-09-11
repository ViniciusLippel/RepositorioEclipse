package l8_ex4;

public class Gabinete {
	
	private String modelo;
	private String tipo;
	private int baias;
	private PlacaMae placamae;
	
	public Gabinete(String modelo, String tipo, int baias, PlacaMae placamae) {
		super();
		this.modelo = modelo;
		this.tipo = tipo;
		this.baias = baias;
		this.placamae = placamae;
	}
	
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public int getBaias() {
		return baias;
	}
	public PlacaMae getPlacamae() {
		return placamae;
	}
	
	public void setModelo(String modelo) {
		if(modelo!="")
			this.modelo = modelo;
	}
	public void setTipo(String tipo) {
		if(tipo!="")
			this.tipo = tipo;
	}
	public void setBaias(int baias) {
		this.baias = baias;
	}
	public void setPlacamae(PlacaMae placamae) {
		this.placamae = placamae;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gabinete [modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", baias=");
		builder.append(baias);
		builder.append(", placamae=");
		builder.append(placamae);
		builder.append("]");
		return builder.toString();
	}
}
