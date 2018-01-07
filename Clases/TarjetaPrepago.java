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
	
	
	
	

}
