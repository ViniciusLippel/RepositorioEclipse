package pa_pg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json {

	public void gravar(int[] vet, String nome) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("src/pa_pg/"+nome+".json");
		writer.write(gson.toJson(vet));
		writer.close();
	}

	public int[] ler(String nome) throws FileNotFoundException {
		Gson gson = new Gson();
		int[] vet;

        BufferedReader br = new BufferedReader(new FileReader("src/pa_pg/"+nome+".json"));
        vet = gson.fromJson(br, int[].class);
 
		return vet;
	}

}
