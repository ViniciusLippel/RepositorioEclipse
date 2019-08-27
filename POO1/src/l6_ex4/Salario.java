package l6_ex4;

public class Salario {

	private double ganho;
	private double horas;
	
	public double getGanho() {
		return ganho;
	}
	public void setGanho(double ganho) {
		this.ganho = ganho;
	}
	
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	public double salarioBruto() {
		return horas*ganho;
	}
	
	public double ir() {
		return this.salarioBruto()*0.11;
	}
	
	public double inss() {
		return this.salarioBruto()*0.08;
	}
	
	public double sindicato() {
		return this.salarioBruto()*0.05;
	}
	
	public double salarioLiquido() {
		return this.salarioBruto()-this.ir()-this.inss()-this.sindicato();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalarioBruto: ");
		builder.append(salarioBruto());
		builder.append("\nIR: ");
		builder.append(ir());
		builder.append("\nINSS: ");
		builder.append(inss());
		builder.append("\nSindicato: ");
		builder.append(sindicato());
		builder.append("\nSalarioLiquido: ");
		builder.append(salarioLiquido());
		return builder.toString();
	}
	
	

}
