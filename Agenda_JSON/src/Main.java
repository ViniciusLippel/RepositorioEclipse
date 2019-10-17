import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
	public static void main(String[] args) throws IOException {
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		Pessoa pes = new Pessoa();
		
		pes.setCodigo(1);
		pes.setNome("Curvello");
		lista.add(pes);
		
		pes = new Pessoa();
		pes.setCodigo(2);
		pes.setNome("Angelo");
		lista.add(pes);
		
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer = new FileWriter("json/pessoas.json");
	    writer.write(gson.toJson(lista));
	    writer.close();
		
	    System.out.println(gson.toJson(lista));
	    builder = new GsonBuilder();
	    gson = builder.create();
	    BufferedReader bufferedReader = new BufferedReader(
	    								new FileReader("json/pessoas.json"));

	    Type listType = new TypeToken<ArrayList<Pessoa>>(){}.getType();

	    lista = new ArrayList<Pessoa>();
	   
	    lista = new Gson().fromJson(bufferedReader, listType);
		
	    for (Iterator<Pessoa> iterator = lista.iterator(); iterator.hasNext();) {
			Pessoa especialidade = (Pessoa) iterator.next();
			System.out.println(especialidade.toString());
		}     
	 }	
}