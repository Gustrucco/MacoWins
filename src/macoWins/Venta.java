package macoWins;

public class Venta {

	private Prenda prenda;
	private int cantidad;
	public java.util.Date fecha;
	
	public Venta(java.util.Date fecha){
		this.fecha = fecha;
	}
	
	public java.util.Date getFecha(){
		return this.fecha;
	}
	
	public Double ganancia(){
		return cantidad * (prenda.precioFinal());
	}
}
