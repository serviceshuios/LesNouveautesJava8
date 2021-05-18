package metier;

public class Personne {
	private String nom;
	private int age;

	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	
	public static int compareA(Personne p1, Personne p2) {
		return p1.age - p2.age;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", age=" + age + "]";
	}
	
}
