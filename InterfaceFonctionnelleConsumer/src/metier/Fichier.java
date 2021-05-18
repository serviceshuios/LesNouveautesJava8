package metier;

import java.util.function.Consumer;

public class Fichier {

	private String nom;

	public Fichier(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void affiche(Consumer<Fichier> sortie) {
		sortie.accept(this);
	}
}
