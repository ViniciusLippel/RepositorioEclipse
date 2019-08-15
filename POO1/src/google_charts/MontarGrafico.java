package google_charts;

import java.io.File;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Scanner;

public class MontarGrafico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		System.out.println("Criação de gráfico para visualização da relação entre a média final de um aluno com seu comprometimento quanto a entrega das tarefas:\n");
		System.out.print("Número de alunos: ");
		int tamanho = entrada.nextInt();
		System.out.print("Número de tarefas: ");
		int nTarefas = entrada.nextInt();
		
		double[] media = new double[tamanho];
		int[] tarefas = new int[tamanho];
		
		for (int i=0; i<tamanho; i++) {
			
			System.out.println("\nAluno "+(i+1)+": ");
			
			System.out.print("Média final: ");
			media[i] = entrada.nextDouble();
			
			System.out.print("Tarefas entregues: ");
			tarefas[i] = entrada.nextInt();
			
			if (i==tamanho-1)
				texto = texto+"["+media[i]+", "+tarefas[i]+"]]);\n";
			else
				texto = texto+"["+media[i]+", "+tarefas[i]+"],";
		}
		
		try {
			FileWriter fw = new FileWriter(new File("grafico.html"));
			fw.write("<html>\r\n" + 
					"  <head>\r\n" + 
					"    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n" + 
					"    <script type=\"text/javascript\">\r\n" + 
					"      google.charts.load('current', {'packages':['corechart']});\r\n" + 
					"      google.charts.setOnLoadCallback(drawChart);\r\n" + 
					"\r\n" + 
					"      function drawChart() {\r\n" + 
					"        var data = google.visualization.arrayToDataTable([" +
					"			['', 'Média / Nº tarefas'],"+	
					texto + 
					"\r\n" + 
					"        var options = {\r\n" + 
					"          title: 'Comparação de média final com o número de tarefas entregues por aluno',\r\n" + 
					"          hAxis: {title: 'Média final', minValue: 0, maxValue: 10},\r\n" + 
					"          vAxis: {title: 'Tarefas entregues', minValue: 0, maxValue: "+(nTarefas)+"},\r\n" + 
					"          legend: 'none'\r\n" + 
					"        };\r\n" + 
					"\r\n" + 
					"        var chart = new google.visualization.ScatterChart(document.getElementById('chart_div'));\r\n" + 
					"\r\n" + 
					"        chart.draw(data, options);\r\n" + 
					"      }\r\n" + 
					"    </script>\r\n" + 
					"  </head>\r\n" + 
					"  <body>\r\n" + 
					"    <div id=\"chart_div\" style=\"width: 900px; height: 500px;\"></div>\r\n" + 
					"  </body>\r\n" + 
					"</html>\r\n" 
					);
			fw.flush();
			fw.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
		
		entrada.close();
	}

}
