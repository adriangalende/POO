package Clases;

public class Fecha {
	private int dia;
	private int mes;
	private int a�o;
	
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.a�o = 1900;
	}
	
	public Fecha(int dia, int mes, int a�o) {
		this.dia = controlDia(dia);
		this.mes = controlMes(mes);
		this.a�o = controlA�o(a�o);
	}
	
	/* M�todos p�blicos */
	
	public int controlDia(int dia) {
		if(dia >= 1 && dia <= 31) {
			return dia;
		}else {
			return 1;
		}
	}
	
	public int controlMes(int mes) {
		if(dia >= 1 && dia <= 12) {
			return mes;
		}else {
			return 1;
		}
	}
	
	public int controlA�o(int a�o) {
		if(a�o >= 1990 && a�o <= 3000) {
			return a�o;
		}else {
			return 1990;
		}
	}
	
	public void setFecha(int dia, int mes, int a�o){
		this.setDia(controlDia(dia));
		this.setMes(controlMes(mes));
		this.setA�o(controlA�o(a�o));
	}
	
	public void incrementarFecha(int diasTotales) {
		int a�os = diasTotales / 365;
		int meses = (diasTotales % 365) / 30;
		int dias = (diasTotales % 365) % 30;
		int[] tiempoTranscurrido = new int[] {a�os, meses, dias};
		System.out.println(a�os + " a�os, " + meses + " meses y " + dias + " dias");
		this.setA�o(controlA�o(this.getA�o() + a�os));
		this.setMes(controlMes(this.getMes() + meses));
		this.setDia(controlDia(this.getDia() + dias));
	}
	
	public void imprimirFecha() {
		System.out.println(this.getDia() + "-" + this.getMes() + "-" + this.getA�o());
	}
	
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	

}
