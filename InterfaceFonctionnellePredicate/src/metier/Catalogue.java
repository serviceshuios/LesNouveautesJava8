package metier;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class Catalogue {

	List<Article> lesArticles = new ArrayList<Article>();
	
	public void ajoute(Article art) {
		lesArticles.add(art);
	}
	
	public List<Article> rechercheArticlePrix(Predicate<Article> f) {
		
		List<Article> retval = new ArrayList<Article>();
		
		for(Article a: lesArticles) {
			if(f.test(a)) {
				retval.add(a);
			}
		}
		
		return retval;
	}
}
