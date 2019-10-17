package l6_ex2;

public class Intervalo {

	private int maior;
	private int menor;
	
	public void setMaior(int maior) {
		this.maior = maior;
	}

	public void setMenor(int menor) {
		this.menor = menor;
	}

	public void inverter() {
		int aux = this.maior;
		this.maior = this.menor;
		this.menor = aux;
	}
	
	public String gerarTxt() {
		StringBuilder builder = new StringBuilder();
		
		if (this.menor>this.maior) {
			this.inverter();
			builder.append("Invertendo...\n");
		}
		
		for (int i=this.menor; i<=this.maior; i++) {
			builder.append(i);
			builder.append(" ");
		}
		
		return builder.toString();
	}
}
