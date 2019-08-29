package l6_ex10;

public class Televisor {
	
	int canal;
	int volume;
	
	
	public void setCanal(int canal) {
		this.canal = canal;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void ligarTV() {
		setCanal(1);
		setVolume(15);
	}
	
	public void aumentarVolume() {
		if (volume<35)
		this.volume++;
	}
	
	public void diminuirVolume() {
		if (volume>0)
			this.volume--;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Televisor [canal=");
		builder.append(canal);
		builder.append(", volume=");
		builder.append(volume);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
