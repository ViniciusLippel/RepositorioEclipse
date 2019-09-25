package votacao;

import java.util.ArrayList;

public class Votacao {

	private ArrayList<Usuario> votou;
	private ArrayList<Candidato> canditatos;
	private Usuario admin;
	private ArrayList<Usuario> podeVotar;
	
	public ArrayList<Usuario> getVotou() {
		return votou;
	}
	public void setVotou(Usuario votou) {
		this.votou.add(votou);
	}
	
	public ArrayList<Candidato> getCanditatos() {
		return canditatos;
	}
	public void setCanditatos(ArrayList<Candidato> canditatos) {
		this.canditatos = canditatos;
	}
	
	public Usuario getAdmin() {
		return admin;
	}
	public void setAdmin(Usuario admin) {
		this.admin = admin;
	}
	
	public ArrayList<Usuario> getPodeVotar() {
		return podeVotar;
	}
	public void setPodeVotar(ArrayList<Usuario> podeVotar) {
		this.podeVotar = podeVotar;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Votacao [votou=");
		builder.append(votou);
		builder.append(", canditatos=");
		builder.append(canditatos);
		builder.append(", admin=");
		builder.append(admin);
		builder.append(", podeVotar=");
		builder.append(podeVotar);
		builder.append("]");
		return builder.toString();
	}
	
}
