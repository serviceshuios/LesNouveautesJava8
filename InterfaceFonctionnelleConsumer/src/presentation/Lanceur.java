package presentation;

import metier.Fichier;
import metier.Repertoire;

public class Lanceur {

	public static void main(String[] args) {
		Fichier f1 = new Fichier("data.txt");
		Fichier f2 = new Fichier("data2.txt");
		
		f1.affiche((f)-> {System.out.println(f.getNom());});
		
		Repertoire r1 = new Repertoire("DIR");
		r1.ajouter(f1);
		r1.ajouter(f2);
		
		System.out.println("------------------------------");
		
		r1.affiche((r) -> {
			System.out.println("DOSSIER : "+r.getNom());
			for (Fichier ff : r.getEnfants()) {
				ff.affiche((f)-> {System.out.println("  "+f.getNom());});
			}
		});

	}

}
