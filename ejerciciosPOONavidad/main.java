package ejerciciosPOONavidad;
import Clases.*;

public class main {

	public static void main(String[] args) {
		
		CuentaCorriente usuario = new CuentaCorriente("Adri", "Galende", "C/imaginaria", "634557628", 3289.00);
		usuario.consultarCuenta();
		usuario.retirarDinero(89.00);
		usuario.consultarCuenta();
		usuario.ingresarDinero(89.00);
		usuario.consultarCuenta();
		usuario.retirarDinero(500.00);
		usuario.consultarCuenta();
		System.out.println(usuario.saldoNegativo());
		
		
		TablaAsignacion tabla = new TablaAsignacion();
	
		System.out.println(tabla.calcularLetra("43182655"));
		
		
		
		

	}

}
