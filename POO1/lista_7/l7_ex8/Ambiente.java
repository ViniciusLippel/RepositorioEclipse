package l7_ex8;

public class Ambiente {
	
	private float area;
	
	public Ambiente(float area) {
		super();
		this.setArea(area);
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ambiente [area=");
		builder.append(area);
		builder.append("]");
		return builder.toString();
	}
	
}
