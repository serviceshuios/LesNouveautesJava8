package metier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Repertoire {

	private String nom;
	private List<Fichier> enfants = new ArrayList<Fichier>();
	
	
	public Repertoire(String nom) {
		super();
		this.nom = nom;
	}
	
	public void ajouter(Fichier fichier) {
		enfants.add(fichier);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Fichier> getEnfants() {
		return enfants;
	}
	public void setEnfants(List<Fichier> enfants) {
		this.enfants = enfants;
	}
	
	public void affiche(Consumer<Repertoire> sortie) {
		sortie.accept(this);
	}
}
