package cone;

public class Main {

	public static void main(String[] args) {
		
		Cone cone = new Cone();
		
		cone.setR(6);
		cone.setZ(8);
		cone.setNivel(1);
		
		System.out.println(cone);
		
//		Scanner entrada = new Scanner(System.in);
//		
//		Cone cone = new Cone();
//		
//		System.out.println("-->Cone");
//		System.out.print("Raio: ");
//		cone.setR(entrada.nextDouble());
//		System.out.print("Altura: ");
//		cone.setZ(entrada.nextDouble());
//		System.out.print("N�vel: ");
//		cone.setNivel(entrada.nextInt());
//		
//		System.out.println("----------\nGeratriz: "+cone.geratriz());
//		System.out.println("----------\n�rea do fundo: "+cone.areaFundo());
//		System.out.println("�rea lateral: "+cone.areaLateral());
//		System.out.println("�rea total: "+cone.areaTotal());
//		System.out.println("----------\nLitros: "+cone.litros());
//		System.out.println("Latas: "+cone.latas());
//		System.out.println("----------\nPre�o total: "+cone.precoTotal());
//		
//		entrada.close();
		
	}

}
