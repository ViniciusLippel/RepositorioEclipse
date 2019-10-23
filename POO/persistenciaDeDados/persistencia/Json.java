package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json implements Gravacao {

	@Override
	public void gravar(List<Pessoa> list) throws IOException {
		ListaPessoa listaPessoa = new ListaPessoa();
		listaPessoa.setListaPessoa(list);
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("agenda.json");
		writer.write(gson.toJson(listaPessoa, ListaPessoa.class));
		writer.close();
	}

	@Override
	public List<Pessoa> ler() {
		Gson gson = new Gson();
		ListaPessoa list = new ListaPessoa();
//		Pessoa pessoa = new Pessoa();
		
	        try {
	 
	            BufferedReader br = new BufferedReader(new FileReader("agenda.json"));
	 
	            //Converte String JSON para objeto Java
	            list = gson.fromJson(br, ListaPessoa.class);
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		return list.getListaPessoa();
	}

}
