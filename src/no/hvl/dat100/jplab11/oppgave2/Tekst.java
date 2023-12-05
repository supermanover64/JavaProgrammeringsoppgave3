package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	protected String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		
		
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public String getTekst() {
		
		return this.tekst;
		
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		
		String thestring = "";
		
		thestring += "TEKST\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n" + this.tekst + "\n";
		
		return thestring;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	@Override
	public String toHTML() {
			
		String thestring = "";
		
		thestring += "\n\t\t";
		thestring += "<h2>" + getBruker() + "@" + getDato() + " [" + getLikes() + "]<h2>";
		thestring += "\n\t\t<p>" + getTekst() + "<p>";
		thestring += "\n\t\t<hr>";
		
		
		return thestring;
		
		//throw new UnsupportedOperationException(TODO.method());
				
	}
}
