package nacionesRugby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Jornada {
	
	private Date fecha;
	
	public Collection<Partido> Partido  = new ArrayList<Partido>();


	public Jornada(Date fecha) {
		
		this.fecha = fecha;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

}
