package l8_ex4;

public class Mouse {
	private String marca;
	private String tipo;
	
	public String getMarca() {
		return marca;
	}
	public String getTipo() {
		return tipo;
	}
	
	public void setMarca(String marca) {
		if(marca!="")
			this.marca = marca;
	}
	public void setTipo(String tipo) {
		if(tipo!="")
			this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mouse [marca=");
		builder.append(marca);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
}
