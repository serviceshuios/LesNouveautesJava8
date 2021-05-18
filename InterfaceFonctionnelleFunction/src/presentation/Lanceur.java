package presentation;

import java.util.function.UnaryOperator;

import metier.Client;
import metier.Facture;

public class Lanceur { 

	public static void main(String[] args) {
		// Interface Function<T,R>
		Client monClient = new Client("Eddy");
		
		String str = monClient.rendre((Client c) -> {return c.getNom();});
		System.out.println("Le client est rendu : "+str);
		
		str = monClient.rendre((Client c) -> {return "<b>"+c.getNom()+"</b>";});
		System.out.println("Le client est rendu : "+str);
		
		//UnaryOperator<String>
		Facture f = new Facture("2021-01");
		System.out.println("Facture initiale :"+f.getNumero());
		f.increment(s -> {return s+"1";});
		System.out.println("Facture finale :"+f.getNumero());
		
		monClient.setFacture(f);
		
		String resultat = monClient.lie((Client c, Facture ff) -> {
			return c.getNom() + " " + ff.getNumero();
		});
		
		System.out.println("Résultat :"+resultat);
	}

}
