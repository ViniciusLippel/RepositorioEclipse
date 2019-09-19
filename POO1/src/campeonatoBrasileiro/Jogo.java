package campeonatoBrasileiro;

import java.sql.Date;

public class Jogo {

	private Date data;
	private TimeJogo mandante;
	private TimeJogo visitante;
	private Estadio estadio;
	private Serie serie;
	
	public Jogo() {
		serie = new Serie();
		estadio = new Estadio();
		mandante = new TimeJogo();
		visitante = new TimeJogo();
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public TimeJogo getTime1() {
		return mandante;
	}
	public void setTime1(TimeJogo time1) {
		this.mandante = time1;
	}
	
	public TimeJogo getTime2() {
		return visitante;
	}
	public void setTime2(TimeJogo time2) {
		this.visitante = time2;
	}
	
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public String verifica() {
		if (mandante.getGol()>visitante.getGol())
			return "Ganhador: "+mandante.getNome()+"\nPlacar: "+mandante.getGol()+"x"+visitante.getGol();
		else if (mandante.getGol()<visitante.getGol())
			return "Ganhador: "+visitante.getNome()+"\nPlacar: "+visitante.getGol()+"x"+mandante.getGol();
		else
			return "Empate \nPlacar: "+mandante.getGol()+"x"+visitante.getGol();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogo [data=");
		builder.append(data);
		builder.append(", time1=");
		builder.append(mandante.toString());
		builder.append(", time2=");
		builder.append(visitante.toString());
		builder.append(", estadio=");
		builder.append(estadio.toString());
		builder.append(", serie=");
		builder.append(serie.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
