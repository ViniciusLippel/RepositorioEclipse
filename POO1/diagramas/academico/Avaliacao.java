package academico;

public class Avaliacao {

	private float nota;
	private float peso;
	private Professor prof;
	private Matricula mat;
	
	public Avaliacao(float nota, float peso, Professor prof, Matricula mat) {
		super();
		this.nota = nota;
		this.peso = peso;
		this.prof = prof;
		this.mat = mat;
	}

	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}

	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Professor getProf() {
		return prof;
	}
	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public Matricula getMat() {
		return mat;
	}
	public void setMat(Matricula mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Avaliacao [nota=");
		builder.append(nota);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", prof=");
		builder.append(prof);
		builder.append(", mat=");
		builder.append(mat);
		builder.append("]");
		return builder.toString();
	}
	
}
