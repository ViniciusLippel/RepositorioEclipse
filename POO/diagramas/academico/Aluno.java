package academico;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	
	public Aluno(String nome, int cpf, ArrayList<Curso> curso) {
		super(nome, cpf);
		this.curso = curso;
	}

	private ArrayList<Curso> curso;

	public ArrayList<Curso> getCurso() {
		return curso;
	}

	public void setCurso(ArrayList<Curso> curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [curso=");
		builder.append(curso);
		builder.append("]");
		return builder.toString();
	}
	
}
