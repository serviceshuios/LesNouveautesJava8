package presentation;

import metier.Facture;

public class Lanceur {

	public static void main(String[] args) {
		
		Facture facture = new Facture("2021-05-18");
		// formattage
		System.out.println(facture);
		
		//parsing
		facture.accept("2020 02 06");
		System.out.println(facture);
	}

}
