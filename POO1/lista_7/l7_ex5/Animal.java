package l7_ex5;

public class Animal {
	
	private double peso;
	private String habitat;
	private String tipoAlimentacao;
	
	public Animal(double peso, String habitat, String tipoAlimentacao) {
		this.setPeso(peso);
		this.setHabitat(habitat);
		this.setTipoAlimentacao(tipoAlimentacao);
	}
	public double getPeso() {
		return peso;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}
	
	public void comer(double quantidade) {
		this.setPeso(this.peso+quantidade);
	}
	
	public void defecar(double quantidade) {
		this.setPeso(this.peso-quantidade);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [peso=");
		builder.append(peso);
		builder.append(", habitat=");
		builder.append(habitat);
		builder.append(", tipoAlimentacao=");
		builder.append(tipoAlimentacao);
		builder.append("]");
		return builder.toString();
	}
	
}
