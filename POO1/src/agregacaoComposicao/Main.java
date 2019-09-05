package agregacaoComposicao;

public class Main {

	public static void main(String[] args) {
		
		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(1500);
		System.out.println(ee);
		
		SistemaDeSom som = new SistemaDeSom();
		som.setMarca("TOPDATOP");
		System.out.println(som);
		
		SistemaDeVideo vid = new SistemaDeVideo();
		vid.setResolucao("800x600");
		System.out.println(vid);
		
		HomeTheater ht = new HomeTheater(som, vid);
		ht.setSom(som);
		ht.setVideo(vid);
		System.out.println(ht);
	}

}
