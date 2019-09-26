package datas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		
		d.montarData(14, 02, 2000);
		System.out.println(d.escreverData());
		d.addDias(57);
		System.out.println(d.escreverData());
	}

}
