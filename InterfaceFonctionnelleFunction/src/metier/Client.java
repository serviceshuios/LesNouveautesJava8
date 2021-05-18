package metier;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Client {

	private String nom;
	private Facture facture;

	public Client(String nom) {
		super();
		this.nom = nom;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String rendre(Function<Client,String> rendu) {
		return rendu.apply(this);
	}
	
	public String lie(BiFunction<Client, Facture, String> liaison) {
		return liaison.apply(this, facture);
	}
}
