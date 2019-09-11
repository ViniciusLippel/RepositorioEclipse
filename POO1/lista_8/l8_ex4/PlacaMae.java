package l8_ex4;

public class PlacaMae {
	
	private String marca;
	private String modelo;
	private Processador processador;
	private HD hd;
	private Memoria memoria;
	
	public PlacaMae(String marca, String modelo, Processador processador, HD hd, Memoria memoria) {
		super();
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setProcessador(processador);
		this.setHd(hd);
		this.setMemoria(memoria);
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Processador getProcessador() {
		return processador;
	}
	public HD getHd() {
		return hd;
	}
	public Memoria getMemoria() {
		return memoria;
	}
	
	public void setMarca(String marca) {
		if(marca!="")
			this.marca = marca;
	}
	public void setModelo(String modelo) {
		if(modelo!="")
			this.modelo = modelo;
	}
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	public void setHd(HD hd) {
		this.hd = hd;
	}
	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlacaMae [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", processador=");
		builder.append(processador);
		builder.append(", hd=");
		builder.append(hd);
		builder.append(", memoria=");
		builder.append(memoria);
		builder.append("]");
		return builder.toString();
	}
}	
