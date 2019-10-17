package l8_ex4;

public class Computador extends EquipamentoEletronico {
	
	private String marca;
	private String modelo;
	private Gabinete gabinete;
	private Teclado teclado;
	private Mouse mouse;
	private Monitor monitor;
	
	public Computador(String marca, String modelo, Gabinete gabinete, Teclado teclado, Mouse mouse, Monitor monitor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.gabinete = gabinete;
		this.teclado = teclado;
		this.mouse = mouse;
		this.monitor = monitor;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Gabinete getGabinete() {
		return gabinete;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	
	public void setMarca(String marca) {
		if(marca!="")
			this.marca = marca;
	}
	public void setModelo(String modelo) {
		if(modelo!="")
			this.modelo = modelo;
	}
	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", gabinete=");
		builder.append(gabinete);
		builder.append(", teclado=");
		builder.append(teclado);
		builder.append(", mouse=");
		builder.append(mouse);
		builder.append(", monitor=");
		builder.append(monitor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
