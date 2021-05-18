package presentation;

import java.util.List;

import metier.Article;
import metier.Catalogue;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalogue cat = new Catalogue();
		cat.ajoute(new Article("Bouteille",10));
		cat.ajoute(new Article("Sandwich",5));
		cat.ajoute(new Article("Cahier",2));
		// je ne retourne que les articles qui ont un prix inférieur à 6$
		List<Article> resultat = cat.rechercheArticlePrix(a -> {return a.getPrix()< 6;});
		
		for (Article article : resultat) {
			System.out.println(article);
		}
	}

}
