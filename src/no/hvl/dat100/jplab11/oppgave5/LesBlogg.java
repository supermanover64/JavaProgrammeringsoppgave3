package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
		Blogg lesBlogg = null;
		
		Scanner leser = null;
		try {
			leser = new Scanner(new File(mappe + filnavn));
			String linje = leser.nextLine();
			
			int antallInnlegg = Integer.parseInt(linje);
			lesBlogg = new Blogg(antallInnlegg);
			
			String type = "";
			int id = 0;
			String bruker = "";
			String dato = "";
			int likes = 0;
			String tekst = "";
			String url = "";
			
			for(int i = 0; i < antallInnlegg; ++i) {
				linje = leser.nextLine();
				type = linje;
				
				linje = leser.nextLine();
				id = Integer.parseInt(linje);
				
				linje = leser.nextLine();
				bruker = linje;
				
				linje = leser.nextLine();
				dato = linje;
				
				linje = leser.nextLine();
				likes = Integer.parseInt(linje);
				
				linje = leser.nextLine();
				tekst = linje;
				
				if(type.contentEquals(TEKST)){
					
					lesBlogg.leggTil(new Tekst(id, bruker, dato, likes, tekst));
				} else if(type.contentEquals(BILDE)) {
					linje = leser.nextLine();
					url = linje;
					
					lesBlogg.leggTil(new Bilde(id, bruker, dato, likes, tekst, url));
				}
			}
		} catch(Exception e) {
			System.out.println("Kunne ikkje finne fila " + mappe + filnavn);
		} finally {
			if(leser != null)
				leser.close();
		}
		
		return lesBlogg;
		
		
		
		//throw new UnsupportedOperationException(TODO.method());

	}
}
