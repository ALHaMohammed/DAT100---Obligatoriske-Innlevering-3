package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[]innleggsTabell;
    private int nesteledig;

    public Blogg() {
		final int stan_leng =20;
        innleggsTabell = new Innlegg[stan_leng];
        nesteledig = 0;


	}

	public Blogg(int lengde) {

        innleggsTabell = new Innlegg[lengde];
        nesteledig =0;
	}

	public int getAntall() {

        return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggsTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i= 0; i< nesteledig; i++){
            if (innleggsTabell[i].erLik(innlegg)){
                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
        return nesteledig < innleggsTabell.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (!ledigPlass()){
            return false;
        }
        if (finnes(innlegg)){
            return false;
        }
        innleggsTabell[nesteledig] = innlegg;
        nesteledig++;

        return true;
	}
	
	public String toString() {
		StringBuilder skriv = new StringBuilder(nesteledig + "\n");
        for (int i =0; i < nesteledig;i++){
            skriv.append(innleggsTabell[i].toString());
        }
        return skriv.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}