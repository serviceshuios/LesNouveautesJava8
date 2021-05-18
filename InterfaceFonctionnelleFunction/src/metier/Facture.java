package metier;

import java.util.function.UnaryOperator;

public class Facture {
	private String numero;

	public Facture(String numero) {
		super();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void increment(UnaryOperator<String> inc) {
		numero = inc.apply(numero);
	}
}
