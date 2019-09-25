package votacao;

public class Candidato {

	private Usuario usuario;

	public Candidato(Usuario usuario) {
		super();
		this.setUsuario(usuario);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Candidato [usuario=");
		builder.append(usuario.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
