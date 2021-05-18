package presentation;

import metier.Facture;

public class Lanceur {

	public static void main(String[] args) {
		Facture facture = new Facture("2021-05");
		
		System.out.println(facture);
		System.out.println("Il reste aujourd'hui "+facture.resteAvantEcheance()+" avant écheance");

	}

}
