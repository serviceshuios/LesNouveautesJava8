package metier;

import static java.time.temporal.ChronoUnit.DAYS;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;

import org.omg.DynamicAny.DynAnySeqHelper;

public class Facture {

	private String numero;
	//private LocalDate date;
	private ZonedDateTime date;
	//private LocalDate echeance;
	private ZonedDateTime echeance;
	private static Period dureeMax = Period.of(0, 2, 0);
	public Facture(String numero) {
		super();
		this.numero = numero;
		//this.date = LocalDate.now();
		this.date = ZonedDateTime.now();
		this.echeance = date.plus(dureeMax);
	}
	
	 public long resteAvantEcheance() {
		return LocalDate.now().until(echeance, DAYS);
	}
	@Override
	public String toString() {
		return "Facture [numero=" + numero + ", date=" + date + ", echeance=" + echeance + "]";
	}
	
	
	
}
