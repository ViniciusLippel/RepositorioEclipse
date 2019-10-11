package academico;

import java.sql.Date;

public class Frequencia {

	private Date dataHora;
	private int aulas;
	private int faltas;
	private Matricula mat;
	private Professor prof;
	
	public Frequencia(Date dataHora, int aulas, int faltas, Matricula mat, Professor prof) {
		super();
		this.dataHora = dataHora;
		this.aulas = aulas;
		this.faltas = faltas;
		this.mat = mat;
		this.prof = prof;
	}
	
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public int getAulas() {
		return aulas;
	}
	public void setAulas(int aulas) {
		this.aulas = aulas;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public Matricula getMat() {
		return mat;
	}
	public void setMat(Matricula mat) {
		this.mat = mat;
	}
	public Professor getProf() {
		return prof;
	}
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [dataHora=");
		builder.append(dataHora);
		builder.append(", aulas=");
		builder.append(aulas);
		builder.append(", faltas=");
		builder.append(faltas);
		builder.append(", mat=");
		builder.append(mat);
		builder.append(", prof=");
		builder.append(prof);
		builder.append("]");
		return builder.toString();
	}
	
}
