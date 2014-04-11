package macoWins;

public class Zapato extends Prenda {

	private Double talle;
	static private Double precioBase;
	
	protected Double precioBase(){
		return precioBase + (5 * talle);
	}

	
}
