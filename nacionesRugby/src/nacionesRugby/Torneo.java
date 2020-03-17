package nacionesRugby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Torneo {

	private Date año;
	
	
	public Collection<Jornada> jornada  = new ArrayList<Jornada>();

	
	
	public Torneo(Date año) {
		this.año = año;
	}


	public Date getAño() {
		return año;
	}


	public void setAño(Date año) {
		this.año = año;
	}


	public void ganador() {
		
	}
	
	
	public void clasificacion() {
		
	}
}
