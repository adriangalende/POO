package Clases;

public class CuentaCorriente {
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private Double saldo;
	//private DNI nif;
	
	
	
	public CuentaCorriente() {

	}
	
	
	
	public CuentaCorriente(String nombre, String apellidos, String direccion, String telefono, Double saldo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.saldo = saldo;
	}
	
	public void retirarDinero(Double retirado){
		this.setSaldo(this.getSaldo() - retirado);
	}
	
	public void ingresarDinero(Double ingresado){
		this.setSaldo(this.getSaldo() + ingresado);
	}
	
	public Boolean saldoNegativo(){
		return this.getSaldo() < 0;
	}
	
	public void consultarCuenta(){
		System.out.println("Datos cuenta de " + nombre + " " + apellidos);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono " + telefono);
		System.out.println("-------------------------------------------");
		System.out.println("Saldo: " + Double.toString(saldo));
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public Double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
	

}
