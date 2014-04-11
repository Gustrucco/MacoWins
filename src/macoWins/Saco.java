package macoWins;

public class Saco extends Prenda {

	private Double cantBotones;
	static private Double precioBase;
	
	protected Double precioBase(){
		return precioBase + (10*cantBotones);
	}

	
}
