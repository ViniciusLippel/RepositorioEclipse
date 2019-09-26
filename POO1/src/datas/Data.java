package datas;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public void montarData(int dia, int mes, int ano) {
		if(validarData(dia, mes))
			this.setMes(mes);
			this.setAno(ano);
			this.setDia(dia);
	}
	
	public boolean validarData(int dia, int mes) {
		if (validaMes(mes) && validaDia(dia, mes)) {
			return true;
		}
		return false;
	}
	
	public String escreverData() {
		if(validarData(dia, mes)) {
			return dia+" de "+mesExt()+" de "+ano;
		}
		else
			return "Data inválida";
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if (validaDia(dia, this.mes))
			this.dia = dia;
	}
	public boolean validaDia(int dia, int mes) {
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			if (dia>0 && dia<=31) {
				return true;
			}
		}
		else if(mes==4 || mes==6 || mes==9 || mes==11) {
			if (dia>0 && dia<=30) {
				return true;
			}
		}
		else if(mes==2) {
			if(!this.bissexto()) {
				if (dia>0 && dia<=28) {
					return true;
				}
			}
			else {
				if (dia>0 && dia<=29) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (validaMes(mes))
			this.mes = mes;
	}
	public boolean validaMes(int mes) {
		if(mes>0 && mes<=12) {
			return true;
		}
		return false;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean bissexto() {
		if ((ano%4==0 && ano%100!=0) || ano%400==0) {
			return true;
		}
		return false;
	}
	
	public String mesExt() {
		String[] mesExt = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
		return mesExt[mes-1];
	}
	
	public void addDias(int n) {
		if(validarData(this.dia, this.mes)) {
			for(int i=0; i<n; i++) {
				if (validaDia(dia+1, mes)) {
					dia = dia+1;
				}
				else if(validaMes(mes+1)) {
					dia = 1;
					mes = mes+1;
				}
				else {
					dia = 1;
					mes = 1;
					ano = ano+1;
				}
			}
		}
	}
}
