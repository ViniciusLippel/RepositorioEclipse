package diagramaPedido;

import java.util.Date;

public class Operacao {
	
	public Date dtInicio;
	public Date dtFim;
	
	public Operacao(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
	public Date getDtFim() {
		return dtFim;
	}
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [dtInicio=");
		builder.append(dtInicio);
		builder.append(", dtFim=");
		builder.append(dtFim);
		builder.append("]");
		return builder.toString();
	}
	
}