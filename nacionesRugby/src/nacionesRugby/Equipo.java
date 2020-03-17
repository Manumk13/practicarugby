package nacionesRugby;

import java.util.ArrayList;
import java.util.Collection;

public class Equipo {
	
	private Pais nombre;
	public Estadio estadio;
	public Entrenador entrena;
	public Collection<Jugador> jugadores  = new ArrayList<Jugador>();


	public Equipo(Pais nombre) {
		
		this.nombre = nombre;
	}

	public Pais getNombre() {
		return nombre;
	}

	public void setNombre(Pais nombre) {
		this.nombre = nombre;
	}
	
	

}
