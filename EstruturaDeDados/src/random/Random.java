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
		int n1=2, n2, random=0;
		while(n1<=1) {
			random = gerarAleatorio();
			
			n1 = random%11;
			n2=1;
			
			while(random<min || random>max) {
				if (random>max) {
					random = (random/n1)%n2;
				}
				
				else if (random<=max){
					random = random*2;
				}
			}
		}
		
		return random;
	}
}
