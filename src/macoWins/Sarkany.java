package macoWins;

public class Sarkany extends Marca{
	
	@Override
	protected Double coeficienteDe(Prenda prenda) {
		if (prenda.precioBase() > 500){
			return 1.35;
		}
		else{
			return 1.1;
		}
	}
}
