package l8_ex4;

public class Processador {
	
	private String marca;
	private String modelo;
	private float clock;
	private float cache;
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public float getClock() {
		return clock;
	}
	public float getCache() {
		return cache;
	}
	
	public void setMarca(String marca) {
		if(marca!="")
			this.marca = marca;
	}
	public void setModelo(String modelo) {
		if(modelo!="")
			this.modelo = modelo;
	}
	public void setClock(float clock) {
		if(clock>0)
			this.clock = clock;
	}
	public void setCache(float cache) {
		if(cache>0)
			this.cache = cache;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Processador [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", clock=");
		builder.append(clock);
		builder.append(", cache=");
		builder.append(cache);
		builder.append("]");
		return builder.toString();
	}
	
}
