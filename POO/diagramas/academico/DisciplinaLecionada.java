package academico;

public class DisciplinaLecionada {

	private int ano;
	private int sem;
	private Disciplina disciplina;
	private Professor professor;
	
	public DisciplinaLecionada(int ano, int sem, Disciplina disciplina, Professor professor) {
		super();
		this.setAno(ano);
		this.setSem(sem);
		this.setDisciplina(disciplina);
		this.setProfessor(professor);
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DisciplinaLecionada [ano=");
		builder.append(ano);
		builder.append(", sem=");
		builder.append(sem);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append(", professor=");
		builder.append(professor);
		builder.append("]");
		return builder.toString();
	}
	
}
