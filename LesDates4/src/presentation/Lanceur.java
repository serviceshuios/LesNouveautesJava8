package presentation;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.util.Set;

// GESTION DES SYSTEMES CALENDAIRES
public class Lanceur {

	public static void main(String[] args) {
		Set<Chronology> lesChronos = Chronology.getAvailableChronologies();
		
		for (Chronology chronology : lesChronos) {
			System.out.println(chronology.toString());
		}

		Chronology japanese = Chronology.of("Japanese");
		System.out.println("--------------------------------------------------------");
		System.out.println(japanese);
		
		ChronoLocalDate cld = japanese.dateNow();
		System.out.println("--------------------------------------------------------");
		System.out.println(cld);
		System.out.println("--------------------------------------------------------");
		System.out.println(cld.getEra());
		System.out.println("--------------------------------------------------------");
		System.out.println(cld.lengthOfYear());
	}

}
