package nacionesRugby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Torneo {

	private Date a�o;
	
	
	public Collection<Jornada> jornada  = new ArrayList<Jornada>();

	
	
	public Torneo(Date a�o) {
		this.a�o = a�o;
	}


	public Date getA�o() {
		return a�o;
	}


	public void setA�o(Date a�o) {
		this.a�o = a�o;
	}


	public void ganador() {
		
	}
	
	
	public void clasificacion() {
		
	}
}
