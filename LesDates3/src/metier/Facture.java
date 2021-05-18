package metier;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Facture {
	private String numero;
	private LocalDate date;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd");
	private DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder()
				.appendLiteral("Le ")
				.appendValue(ChronoField.DAY_OF_MONTH)
				.appendLiteral(" du mois n° ")
				.appendValue(ChronoField.MONTH_OF_YEAR)
				.appendLiteral(" de l'an ")
				.appendValue(ChronoField.YEAR);

	public Facture(String numero) {
		super();
		this.numero = numero;
		this.date = LocalDate.now();
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd");
		//return "Facture [numero=" + numero + ", date=" + date.format(dtf) + "]";
		return "Facture [numero=" + numero + ", date=" + date.format(dtfb.toFormatter()) + "]";
	}
	
	public void accept(String str) {
		date = LocalDate.parse(str, dtf);
	}

	
}
