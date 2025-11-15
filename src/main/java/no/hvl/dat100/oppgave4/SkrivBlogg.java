package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        String fulList = mappe +"/" + filnavn;
         boolean check  = false;
         try (PrintWriter skriver = new PrintWriter (fulList)){
             String blogDatWcheck = samling.toString();
             String bolgDatWoCheck = blogDatWcheck.trim().replace("\n", "");

             skriver.print(bolgDatWoCheck);
             check = true;

         }
         catch (FileNotFoundException e){
             System.err.println("Feil med" + fulList);
             check = false;
         }
         return check;


    }
}