package random;

public class Random {
	
	public int gerarAleatorio(){
		Long timeMillis = new Long(System.currentTimeMillis());
		
		String seed = Long.toString(timeMillis);
		
		int n1 = Integer.parseInt(seed.substring(7,12));
		int n2 = Integer.parseInt(seed.substring(11));
		int n3 = Integer.parseInt(seed.substring(12))+1;
		
		int random = Math.abs(((n2*n1)/n3)/n3);
		return random;
	}
	
	public int gerarAleatorioIntervalo(int min, int max) {
		int random=0;
		
		random = gerarAleatorio()%(max-min);
		
		return random;
	}
	
	public String caraCoroa(int n) throws InterruptedException {
		int cara=0, coroa=0;
		String ganhador = "Ganhador: ";
		for(int i=0; i<n; i++) {
			int random = gerarAleatorio()%2;
			if(random==0) {
				cara++;
				System.out.println("Cara");
			}
			else {
				coroa++;
				System.out.println("Coroa");
			}
			Thread.sleep(1);
		}
		
		if(cara>coroa)
			ganhador = ganhador+" Cara, "+cara+" vezes";
		else if(coroa>cara)
			ganhador = ganhador+" Coroa"
					+ ", "+coroa+" vezes";
		else
			ganhador = "Empate";
		
		return ganhador;
	}
	
	public int lancarDado(int l) {
		int random=0;
		if (l==4 || l==6 || l==8 || l==10 || l==12 || l==20 || l==60 || l==100) {
			random = gerarAleatorio()%l;
		}
		return random;
	}
}
