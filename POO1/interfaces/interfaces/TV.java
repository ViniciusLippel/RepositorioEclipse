package interfaces;

public class TV extends EquipamentoEletronico implements IControle{
	
	private String marca;
	private String modelo;
	private boolean estado;
	private int volume;
	private int canal;
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public boolean ligaDesliga() {
		if(this.estado == false)
			this.estado = true;
		else
			this.estado = false;
		return this.estado;
	}

	@Override
	public int alterarCanal(int Canal) {
		this.canal = canal;
		return this.canal;
	}

	@Override
	public int canalMais() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int canalMenos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int volumeMais() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int volumeMenos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
