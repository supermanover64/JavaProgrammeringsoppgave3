package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
		
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		
		return this.bruker;
		
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		
		return this.dato;
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {
		
		return this.id;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getLikes() {
		
		return this.likes;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike () {
		
		this.likes++;
		
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		return (innlegg.id == this.id);
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		
		String thestring = "";
		
		thestring += this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n";
		
		return thestring;
		
		
		//throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		String thestring = "";
		
		
		thestring += "\n\t\t";
		thestring += "<h2>" + getBruker() + "@" + getDato() + " [" + getLikes() + "]<h2>";
		thestring += "\n\t\t<hr>";
		
		return thestring;
		
		//throw new UnsupportedOperationException(TODO.method());
				
	}
}
