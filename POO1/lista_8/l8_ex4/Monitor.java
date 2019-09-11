package l8_ex4;

public class Monitor {
	
	private String marca;
	private String tipo;
	private String resolucao;
	
	public String getMarca() {
		return marca;
	}
	public String getTipo() {
		return tipo;
	}
	public String getResolucao() {
		return resolucao;
	}
	
	public void setMarca(String marca) {
		if(marca!="")
			this.marca = marca;
	}
	public void setTipo(String tipo) {
		if(tipo!="")
			this.tipo = tipo;
	}
	public void setResolucao(String resolucao) {
		if(resolucao!="")
			this.resolucao = resolucao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Monitor [marca=");
		builder.append(marca);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", resolucao=");
		builder.append(resolucao);
		builder.append("]");
		return builder.toString();
	}
	
}
