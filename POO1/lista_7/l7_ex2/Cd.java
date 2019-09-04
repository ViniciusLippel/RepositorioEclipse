package l7_ex2;

public class Cd extends Midia {
	
	private int faixas;
	private String artista;
	private String album;
	
	public Cd(int codigo, String descricao, String gravadora, float duracao, int faixas, String artista, String album) {
		super(codigo, descricao, gravadora, duracao);
		this.setFaixas(faixas);
		this.setArtista(artista);
		this.setAlbum(album);
	}
	public int getFaixas() {
		return faixas;
	}
	public String getArtista() {
		return artista;
	}
	
	public String getAlbum() {
		return album;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cd [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
