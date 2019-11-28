package trabalhoFinal;

public class Mesa {
	private boolean emUso;
	private Mesa proxima;
	
	public Mesa() {
		emUso = false;
	}
	
	public Mesa getProxima() {
		return proxima;
	}
	public void setProxima(Mesa proxima) {
		this.proxima = proxima;
	}
	public boolean isEmUso() {
		return emUso;
	}
	public void setEmUso(boolean emUso) {
		this.emUso = emUso;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mesa [emUso=");
		builder.append(emUso);
		builder.append(", proxima=");
		builder.append(proxima);
		builder.append("]");
		return builder.toString();
	}
	
}
