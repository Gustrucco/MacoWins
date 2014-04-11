package macoWins;

public class Pantalon extends Prenda{
	
	private Double telaUtilizada;
	static private Double precioBase;
	
	protected Double precioBase(){
		return precioBase + telaUtilizada;
	}


}
