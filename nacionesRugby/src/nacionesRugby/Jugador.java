package nacionesRugby;

import java.util.Date;

public class Jugador  extends Persona {

	
	private Posicion posicion;
	
	public Jugador capitan;
	
	public Jugador(String nombre, Date fechaNacimiento,Posicion posicion) {
		super(nombre, fechaNacimiento);
		
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	
}
