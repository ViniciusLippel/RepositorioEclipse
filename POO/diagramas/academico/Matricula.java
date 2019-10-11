package academico;

public class Matricula {

	private int numero;
	private Aluno aluno;
	private DisciplinaLecionada dl;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public DisciplinaLecionada getDl() {
		return dl;
	}
	public void setDl(DisciplinaLecionada dl) {
		this.dl = dl;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Matricula [numero=");
		builder.append(numero);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append(", dl=");
		builder.append(dl);
		builder.append("]");
		return builder.toString();
	}
	
}
