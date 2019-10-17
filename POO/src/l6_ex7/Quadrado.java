package l6_ex7;

public class Quadrado {

	int tamanhoDoLado;

	public int getTamanhoDoLado() {
		return tamanhoDoLado;
	}

	public void setTamanhoDoLado(int tamanhoDoLado) {
		if (tamanhoDoLado>0)
			this.tamanhoDoLado = tamanhoDoLado;
	}
	
	public int calcularArea() {
		return tamanhoDoLado*tamanhoDoLado;
	}

}
