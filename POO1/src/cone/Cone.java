package cone;

public class Cone {
	
	private double z;
	private double r;
	private int nivel;
	
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		if(z>0)
			this.z = z;
	}
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		if(r>0)
			this.r = r;
	}
	
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public double geratriz() {
		double g = Math.pow(this.z, 2) + Math.pow(this.r, 2);
		g = Math.sqrt(g);
		return g;
	}
	
	public double areaTotal() {
		return 3.14 * this.r * (this.r + this.geratriz());
	}
	
	public double areaFundo() {
		return 3.14 * Math.pow(this.r, 2);
	}
	
	public double areaLateral() {
		return 3.14 * this.r * this.geratriz();
	}
	
	public double litros() {
		return this.areaTotal()*3.45;
	}
	
	public double latas() {
		return Math.ceil(this.litros()/18);
	}
	
	public double precoTotal() {
		double preco=0;
		if(this.nivel==1)
			preco = this.latas()*238.90;
		else if(this.nivel==2)
			preco =  this.latas()*467.98;
		else if(this.nivel==3)
			preco = this.latas()*758.34;
		return preco;
	}
	
	
}
