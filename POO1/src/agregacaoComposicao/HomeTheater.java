package agregacaoComposicao;

public class HomeTheater {
	
	protected SistemaDeSom som;
	protected SistemaDeVideo video;
	
	public HomeTheater(SistemaDeSom som, SistemaDeVideo video) {
		this.som = new SistemaDeSom();
		this.video = new SistemaDeVideo();
	}
	public SistemaDeSom getSom() {
		return som;
	}
	public SistemaDeVideo getVideo() {
		return video;
	}
	
	public void setSom(SistemaDeSom som) {
		this.som = som;
	}
	public void setVideo(SistemaDeVideo video) {
		this.video = video;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomeTheater [som=");
		builder.append(som.toString());
		builder.append(", video=");
		builder.append(video.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
