package piramide;

public class Piramide {
	
	private double ab;
	private double h;
	private int tipo;
	
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		this.ab = ab;
	}
	
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public double a1() {
		double a1 = Math.pow(this.ab, 2) + Math.pow(this.h, 2);
		a1 = Math.sqrt(a1);
		return a1;
	}
	
}
