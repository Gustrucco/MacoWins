package macoWins;

public abstract class Prenda implements Apreciable {
	
	private Boolean importada;
	private Marca marca;
	
	protected abstract Double precioBase();
	
	@Override
	public Double getPrecioBase(){ 
		return this.precioBase();
	}
	
	private Double tasaDeImportacion(){
		if (importada){
			return 1.3;
		}
		else{
			return 1.0;
		}
	}
	
	private Double coeficienteMarca(){
		return marca.coeficienteDe(this);
	}

	public Double precioFinal(){
		return ((this.precioBase() + Negocio.valorFijo) * this.tasaDeImportacion() ) * this.coeficienteMarca();
	}
	
	
	
}
