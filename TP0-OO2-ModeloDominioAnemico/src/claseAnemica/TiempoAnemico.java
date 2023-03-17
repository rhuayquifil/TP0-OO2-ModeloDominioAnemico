package claseAnemica;

import java.util.Calendar;
import java.util.Date;

public class TiempoAnemico {
	// parecen simples DTO y su comportamiento los manejan: servicios, managers, etc, 
	// los cuales se realizan su tarea preguntando a nuestras magras entidades sobre
	// su estado y cambiándolo si es necesario.
	
	// ESTO NO DEBERIA SER ASI
	
	public Calendar miTiempo;

	public TiempoAnemico(Calendar miTiempo) {
		super();
		this.miTiempo = miTiempo;
	}

	public Calendar getMiTiempo() {
		return miTiempo;
	}

	public void setMiTiempo(Calendar miTiempo) {
		this.miTiempo = miTiempo;
	}
	
	
}
