package presentation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.IsoChronology;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Lanceur {

	public static void main(String[] args) {
		LocalDateTime tp = LocalDateTime.now();
		LocalTime lt = LocalTime.of(12, 12);
		
		tp.minusMinutes(12);
		
		ZoneId zid = ZoneId.of("Europe/Paris");
		ZonedDateTime zd = ZonedDateTime.of(tp, zid);
		
		Period p = Period.of(1, 0, 0);
		
		tp.plus(p);
		
		Chronology dt = Chronology.ofLocale(Locale.FRENCH);
		ChronoLocalDate cld = dt.dateNow();
		int annee = cld.get(ChronoField.YEAR);
		
		cld = JapaneseDate.now();
		annee = cld.get(ChronoField.YEAR);

	}

}
