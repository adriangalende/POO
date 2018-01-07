package Clases;

public class TarjetaPrepago {
	private String numeroTelefono;
	private DNI nif;
	private Double saldo;
	private Hora consumo;
	
	public TarjetaPrepago() {
		
	}
	
	
	public TarjetaPrepago(String numeroTelefono, DNI nif, Double saldo) {
		this.numeroTelefono = numeroTelefono;
		this.nif= nif;
		this.saldo = saldo;
		this.consumo = new Hora();
	}

	
	/* metodos publicos */
	
	
	public void ingresarSaldo(Double ingreso) {
		if(ingreso > 0) {
			this.setSaldo(this.getSaldo() + ingreso); 
		}
	}
	
	public void enviarMensaje(int mensajes) {
		/* restamos 9 céntimos por mensaje enviado*/
		if(mensajes > 0) {
			this.setSaldo(this.getSaldo() - (0.09 * mensajes));
		}
	}
	
	public void realizarLlamada(int segundos) {
		/* 15 cents establecimiento, 1 cent el segundo */
		this.setSaldo(this.getSaldo() - (0.15 + 0.01 * segundos));
		this.segundoAHora(segundos);
	}
	
	public void consultarTarjeta(){
		System.out.println("Datos tarjeta prepago");
		System.out.println("Numero telefono: " + this.getNumeroTelefono());
		System.out.println("DNI titular: " + nif.getCadena());
		System.out.println(this.formateoHora(consumo) + " segundos consumidos");
		consumo.imprimirHora();
		System.out.println("Saldo actual: " + this.getSaldo().toString() + " €");
	}
	
	
	public String getNumeroTelefono() {
		return numeroTelefono;
	}


	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}


	public DNI getNif() {
		return nif;
	}


	public void setNif(DNI nif) {
		this.nif = nif;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Hora getConsumo() {
		return consumo;
	}


	public void setConsumo(Hora consumo) {
		this.consumo = consumo;
	}
	
	/* Métodos privados */
	
	private int formateoHora(Hora consumo){
		int[] matrizTiempo = consumo.getHora();
		return (matrizTiempo[0] * 3600) + (matrizTiempo[1] * 60) + matrizTiempo[2];
	}
	
	private void segundoAHora(int segundos) {
		/* Añadimos los segundos ya consumidos */
		segundos += this.formateoHora(this.getConsumo());
		int horas = segundos / 3600;
	    int segundosRestantes = segundos - horas * 3600;
	    int minutos = segundosRestantes / 60;
	    int segs = segundosRestantes - minutos * 60;
		consumo.setHora(horas, minutos, segs);
		this.setConsumo(consumo);
	}
	
	

}
