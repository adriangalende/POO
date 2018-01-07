package ejerciciosPOONavidad;
import java.util.Arrays;
import java.util.Iterator;

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
		System.out.println(tabla.calcularLetra(43182655));
		tabla.mostrarTabla();
	

		
		String[] listaDNI = new String[] {"43182655V", "43182653V", "43182653S","4310Z"};
		DNI dni = new DNI("");
		for (String dniTest : listaDNI) {
			dni.setCadena(dniTest);
			dni.checkDNI();
			System.out.println("La letra para la parte numérica "+ dni.getCadena().substring(0, dni.getCadena().length()-1) +" debería ser: " + dni.obtenerLetra());			
			System.out.println(dni.getNumeroSano());
			dni.checkLetra();
			System.out.println(dni.getLetraSana());			    
		}
		
		
		
		Hora hora = new Hora(13,32,5);
		System.out.println(Arrays.toString(hora.getHora()));
		hora.imprimirHora();

		hora.setHora(23,60,58);
		hora.imprimirHora();
	}

}
