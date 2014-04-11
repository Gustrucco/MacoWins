package macoWins;

import java.util.Collection;


public class Negocio {
	private Collection<Venta> ventas;
 	static int valorFijo;
	
	private Double gananciasDelDia(java.util.Date dia){

		return this.ventasDelDia(dia).stream().collect(java.util.stream.Collectors.summingDouble(Venta::ganancia));
	}
	
	private Collection<Venta> ventasDelDia(java.util.Date dia){
		
		return ventas.stream().filter((Venta venta) -> (venta.fecha == dia)).collect(java.util.stream.Collectors.toList());
	}
	
	
}
