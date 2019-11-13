package trabalhoFinal;

public class Mesa {
	private int numero;
	private Mesa proxima;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Mesa getProxima() {
		return proxima;
	}
	public void setProxima(Mesa proxima) {
		this.proxima = proxima;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mesa [numero=");
		builder.append(numero);
		builder.append(", proxima=");
		builder.append(proxima);
		builder.append("]");
		return builder.toString();
	}
	
}
