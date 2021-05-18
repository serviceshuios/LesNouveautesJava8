package presentation;

import metier.MaClasse;
import metier.MonInterface;

public class Lanceur {

	public static void main(String[] args) {
		
		// Dans une méthode static
		declencheExecution(() -> System.out.println("Execution ..."));
		
		MonInterface maFonction = () -> System.out.println("Execution retardée...");
		
		maFonction.execute();
		
		// avec une classe
		// exemple 1
		MaClasse monObjet = new MaClasse();
		//ici on fait référence à l'adresse d'une méthode d'objet
		maFonction = monObjet::execute;
		//puis on execute la méthode
		maFonction.execute();
		// exemple 2
		declencheExecution(monObjet::execute);
	}

	public static void declencheExecution(MonInterface mi) {
		mi.execute();
	}
}
