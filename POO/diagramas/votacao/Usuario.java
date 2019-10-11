package votacao;

public class Usuario {

	private String email;

	public Usuario(String email) {
		super();
		this.setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
}
