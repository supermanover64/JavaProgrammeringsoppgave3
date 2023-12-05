package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.url = url;
		
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		this.url = url;
		
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}
	
	
	public String getUrl() {
		
		return this.url;
		
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setUrl(String url) {
		
		this.url = url;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		
		String thestring = "";
		
		thestring += "BILDE\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n" + this.tekst + "\n" + this.url + "\n";
		
		return thestring;
		
		//throw new UnsupportedOperationException(TODO.method ());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	@Override
	public String toHTML() {
		String thestring = "";
		
		thestring += "\n\t\t";
		thestring += "<h2>" + getBruker() + "@" + getDato() + " [" + getLikes() + "]<h2>";
		thestring += "\n\t\t<p>" + getTekst() + "<p>";
		thestring += "\n\t\t<iframe src=\"" + getUrl() + "\" height=600 width=800></iframe><hr>";
		
		
		return thestring;
		
		//throw new UnsupportedOperationException(TODO.method());
				
	}
}
