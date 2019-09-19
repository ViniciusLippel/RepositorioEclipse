package campeonatoBrasileiro;

import java.util.ArrayList;

public class Time {

	private String nome;
	private Tecnico tecnico;
	private ArrayList<Jogador> jogadores;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Time [nome=");
		builder.append(nome);
		builder.append(", tecnico=");
		builder.append(tecnico.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
