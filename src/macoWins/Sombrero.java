package macoWins;

public class Sombrero extends Prenda {
	
	private Double coeficienteMetroSexualidad;
	static private Double precioBase;
	
	protected Double precioBase(){
		return precioBase + coeficienteMetroSexualidad;
	}

}
