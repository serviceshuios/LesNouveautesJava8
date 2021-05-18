package metier;

public class Article {

	private String nom;
	private int prix;
	
	
	public Article(String nom, int prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Article [nom=" + nom + ", prix=" + prix + "]";
	}
	
}
