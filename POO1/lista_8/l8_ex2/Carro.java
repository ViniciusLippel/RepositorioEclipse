package l8_ex2;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	private Pessoa dono;
	private Motor motor;
	
	public Carro(String fabricante, String modelo, String cor, int ano, Pessoa dono, Motor motor) {
		this.setFabricante(fabricante);
		this.setModelo(modelo);
		this.setCor(cor);
		this.setAno(ano);
		this.setDono(dono);
		this.setMotor(motor);
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	public int getAno() {
		return ano;
	}
	public Pessoa getDono() {
		return dono;
	}
	public Motor getMotor() {
		return motor;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [fabricante=");
		builder.append(fabricante);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", dono=");
		builder.append(dono.toString());
		builder.append(", motor=");
		builder.append(motor.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
