package Clases;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 1900;
	}
	
	public Fecha(int dia, int mes, int año) {
		this.dia = controlDia(dia);
		this.mes = controlMes(mes);
		this.año = controlAño(año);
	}
	
	/* Métodos públicos */
	
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
	
	public int controlAño(int año) {
		if(año >= 1990 && año <= 3000) {
			return año;
		}else {
			return 1990;
		}
	}
	
	public void setFecha(int dia, int mes, int año){
		this.setDia(controlDia(dia));
		this.setMes(controlMes(mes));
		this.setAño(controlAño(año));
	}
	
	public void incrementarFecha(int diasTotales) {
		
		int años = diasTotales / 365;
		this.setAño(controlAño(this.getAño() + años));
		
		int meses = (diasTotales % 365) / 30;
		this.setMes(controlMes(this.getMes() + meses));
		
		int dias = (diasTotales % 365) % 30;
		this.setDia(controlDia(this.getDia() + dias));
	}
	
	public String getFecha() {
		return this.getDia() + "-" + this.getMes() + "-" + this.getAño();
	}

	public void imprimirFecha() {
		System.out.println(this.getDia() + "-" + mesLetra(this.getMes()) + "-" + this.getAño());
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	/* Métodos privados */
	
	private String mesLetra(int mes){
		String[] meses = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		return meses[mes-1];
	}

}
