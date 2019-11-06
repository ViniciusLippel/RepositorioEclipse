package pa_pg;

import java.io.File;
import java.io.FileWriter;

public class GraficoLinha {

	public void montarGrafico(int[] vet, String nome) {
		String texto="";
		for (int i=0; i<vet.length; i++) {
			
			if (i==vet.length-1)
				texto = texto+"["+i+", "+vet[i]+"]]);\r\n";
			else
				texto = texto+"["+i+", "+vet[i]+"],\r\n";
		}
		try {
			FileWriter fw = new FileWriter(new File("src/pa_pg/"+nome+".html"));
			fw.write("<html>\r\n" + 
					"  <head>\r\n" + 
					"    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n" + 
					"    <script type=\"text/javascript\">\r\n" + 
					"      google.charts.load('current', {'packages':['corechart']});\r\n" + 
					"      google.charts.setOnLoadCallback(drawChart);\r\n" + 
					"\r\n" + 
					"      function drawChart() {\r\n" + 
					"        var data = google.visualization.arrayToDataTable([\r\n" + 
					"          ['Indice', 'Número'],\r\n" + 
								texto + 
					"\r\n" + 
					"        var options = {\r\n" + 
					"          title: 'Company Performance',\r\n" + 
					"          curveType: 'function',\r\n" + 
					"          legend: { position: 'bottom' }\r\n" + 
					"        };\r\n" + 
					"\r\n" + 
					"        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\r\n" + 
					"\r\n" + 
					"        chart.draw(data, options);\r\n" + 
					"      }\r\n" + 
					"    </script>\r\n" + 
					"  </head>\r\n" + 
					"  <body>\r\n" + 
					"    <div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\r\n" + 
					"  </body>\r\n" + 
					"</html>\r\n"
					);
			fw.flush();
			fw.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
	}
}
