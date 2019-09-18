package projetoURL;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) throws IOException {
		URL url;
		URLConnection uc;
		StringBuilder parsedContentFromUrl = new StringBuilder();
		String urlString = "https://www.urionlinejudge.com.br/judge/pt/profile/44042";
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

		System.out.println(stringArr[posNome + 1]);
		for (int i = inicio + 2; i <= fim - 2; i++) {
			System.out.println(stringArr[i]);
		}
	}
}
