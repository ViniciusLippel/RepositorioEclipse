package fila;

public class MainPares {

	public static void main(String[] args) {
		Fila f = new Fila();
		Fila f_pares = new Fila();
		Fila f_impares = new Fila();
		
		f.add(1);
		f.add(5);
		f.add(4);
		f.add(2);
		f.add(7);
		
		System.out.println(f.get(3));
		
		for (int i=0; i<f.tamanho(); i++) {
			if (f.get(i)%2 == 0)
				f_pares.add(f.getElemento(i).getNum());
			else
				f_impares.add(f.getElemento(i).getNum());
		}
		
		System.out.println(f_impares.get(1));
		System.out.println(f_pares.get(0));
	}

}
