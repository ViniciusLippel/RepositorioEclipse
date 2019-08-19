package random;

public class Random {
	
	public int gerarAleatorio(){
		Long timeMillis = new Long(System.currentTimeMillis());
		
		String seed = Long.toString(timeMillis);
		
		System.out.println(seed.substring(7,12));
		
		int n1 = Integer.parseInt(seed.substring(7,12));
		int n2 = Integer.parseInt(seed.substring(11));
		int n3 = Integer.parseInt(seed.substring(12))+1;
		
		int random = Math.abs(((n2*n1)/n3)/n3);
		return random;
	}
}
