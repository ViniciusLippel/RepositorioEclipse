package l8_ex1;

import l8_ex1.EquipamentoEletronico;
import l8_ex1.HomeTheater;
import l8_ex1.SistemaDeSom;
import l8_ex1.SistemaDeVideo;

public class Main {

	public static void main(String[] args) {
		
		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(1500);
		System.out.println(ee);
		
		SistemaDeSom som = new SistemaDeSom();
		som.setTensao(220);
		som.setConsumo(1234);
		som.setMarca("TOPDATOP");
		som.setModelo("zx-1");
		som.setPotencia(1242);
		System.out.println(som);
		
		SistemaDeVideo vid = new SistemaDeVideo();
		vid.setTensao(220);
		vid.setConsumo(56);
		vid.setMarca("TOPDATOP");
		vid.setModelo("zzzz");
		vid.setTipo("Wide-screen");
		vid.setResolucao("800x600");
		System.out.println(vid);
		
		HomeTheater ht = new HomeTheater();
		ht.setSom(som);
		ht.setVideo(vid);
		
		System.out.println(ht);
	}

}
