package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	
	private Innlegg[] innleggtabell;
	private int nesteledig;
	
	
	

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return this.nesteledig;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		
		return this.innleggtabell;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		int index = -1;
		
		for(int i = 0; i < this.getAntall(); ++i) {
			if(innlegg.erLik(this.innleggtabell[i])){
				index = i;
				break;
			}
				
		}
		
		return index;
		
		
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		
		return (finnInnlegg(innlegg) != -1);
		
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		
		if(this.nesteledig < this.innleggtabell.length)
			return true;
		else
			return false;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(this.finnes(innlegg) == false && this.ledigPlass()){
			
			this.innleggtabell[this.nesteledig++] = innlegg;
			
			return true;
		}else {
			return false;
		}
		
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		String thestring = "";
		
		thestring += this.getAntall() + "\n";
		
		for(int i = 0; i < this.nesteledig; ++i) {
			thestring += this.innleggtabell[i].toString();
		}
		
		
		
		return thestring;
		
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] utvidatabell = new Innlegg[this.innleggtabell.length*2];
		
		for(int i = 0; i < this.nesteledig; ++i) {
			utvidatabell[i] = this.innleggtabell[i];
		}
		
		this.innleggtabell = utvidatabell;
		
		
		
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		if(this.finnes(innlegg) == false){
			if(!this.ledigPlass()) {
				this.utvid();
			}
			
			this.innleggtabell[this.nesteledig++] = innlegg;
			
			return true;
			
		}else {
			return false;
		}
		
		//throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		int index = this.finnInnlegg(innlegg);
		
		if(index != -1){
			int i;
			for(i = index; i < this.nesteledig-1; ++i)
			{
				this.innleggtabell[i] = this.innleggtabell[i+1];
			}
			
			--nesteledig;
			
			this.innleggtabell[nesteledig] = null;
			
			return true;
		}else{
			return false;
		}
		
		
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		int idtabell[] = new int[nesteledig];
		
		for(int i = 0; i < nesteledig; ++i) {
			idtabell[i] = this.innleggtabell[i].getId();
		}
		
		return idtabell;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
}