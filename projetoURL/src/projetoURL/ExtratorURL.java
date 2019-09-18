package projetoURL;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class ExtratorURL {

	private String url;

	public ExtratorURL(String url) {
		super();
		this.url = url;
	}

	public static Pessoa URI(String html) throws IOException {
		URL url;
		URLConnection uc;
		StringBuilder parsedContentFromUrl = new StringBuilder();
		String urlString = html;
		url = new URL(urlString);
		uc = url.openConnection();
		uc.connect();
		uc = url.openConnection();
		uc.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		uc.getInputStream();
		BufferedInputStream in = new BufferedInputStream(uc.getInputStream());
		int ch;
		while ((ch = in.read()) != -1) {
			parsedContentFromUrl.append((char) ch);
		}
		FileWriter arq = new FileWriter("info.html");
		arq.append(parsedContentFromUrl);
		arq.close();

		String st;
		BufferedReader br = new BufferedReader(new FileReader("info.html"));

		String pattern = "(?:</span>|</li>|<span>|<li>|</ul>|PosiÁ„o:|Desde:|Pontos:|Resolvido:|Tentado:|Submiss√µes:|<li itemprop=\"alumniOf\" itemscope itemtype=\"http://schema.org/EducationalOrganization\">|Pa√≠s:|Universidade:|\\<a[^()]*\\\">|</a>|\\<i[^()]*\\'>|</i>)|<br/>";
		List<String> list = new ArrayList<String>();
		while ((st = br.readLine()) != null) {
			st = st.replaceAll(pattern, "").trim();
			if (st.length() != 0) {
				list.add(st);
			}
		}

		String[] stringArr = list.toArray(new String[0]);
		int inicio = 0, fim = 0, posNome = 0;

		for (int i = 0; i < stringArr.length; i++) {
			if (stringArr[i].equals("<ul class=\"pb-information\">")) {
				inicio = i;
			} else if (stringArr[i].equals("<div class=\"pb-footer\"></div>")) {
				fim = i;
			} else if (stringArr[i].equals("<p itemprop=\"name\">")) {
				posNome = i;
			}
		}

		String vet[] = new String[9];
		vet[0] = stringArr[posNome + 1];
		vet[1] = stringArr[101];
		int x = 0;

		for (int i = inicio + 2; i <= fim - 2; i++) {
			x++;
			vet[x] = stringArr[i];
		}

		Pessoa p = new Pessoa();
		
		String nome = vet[0];
		p.setNome(nome);
		
		String posicao = vet[1];
		p.setPosicao(posicao);

		String pais = vet[2];
		p.setPais(pais);

		String universidade = vet[3];
		p.setUniversidade(universidade);
		
		String desde = vet[4];
		p.setDesde(desde);

		String pontos = vet[5];
		p.setPontos(pontos);

		int resolvido = Integer.parseInt(vet[6]);
		p.setResolvido(resolvido);

		int tentado = Integer.parseInt(vet[7]);
		p.setTentado(tentado);

		int submissoes = Integer.parseInt(vet[8]);
		p.setSubmissoes(submissoes);
		
		return p;
	}

}
