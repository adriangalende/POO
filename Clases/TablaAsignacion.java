package Clases;

public class TablaAsignacion {
	private String[] tabla = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

	public TablaAsignacion() {
	}
	
	
	public TablaAsignacion(String[] tabla) {
		this.tabla = tabla;
	}
	
	public String getLetra(int posicion){
		try {
			return this.tabla[posicion];
		} catch (Exception e) {
			return "Posición letra fuera de rango";
		}
	}
	
	public int getModulo(){
		return this.tabla.length;
	}
	
	
	public Boolean letraPermitida(String letra){
		for(int i=0 ; i <= this.tabla.length ; i++ ){
			if(letra == this.tabla[i]){
				return true;
			}
		}
		return false;
	}
	
	public String calcularLetra(String DNI){
		int posicion = Integer.parseInt(DNI) % this.getModulo();
		return this.getLetra(posicion);
	}
		
	
}
