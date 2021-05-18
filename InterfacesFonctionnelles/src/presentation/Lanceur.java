package presentation;

import metier.MaClasse;
import metier.MonInterface;

public class Lanceur {

	public static void main(String[] args) {
		
		// Dans une m�thode static
		declencheExecution(() -> System.out.println("Execution ..."));
		
		MonInterface maFonction = () -> System.out.println("Execution retard�e...");
		
		maFonction.execute();
		
		// avec une classe
		// exemple 1
		MaClasse monObjet = new MaClasse();
		//ici on fait r�f�rence � l'adresse d'une m�thode d'objet
		maFonction = monObjet::execute;
		//puis on execute la m�thode
		maFonction.execute();
		// exemple 2
		declencheExecution(monObjet::execute);
	}

	public static void declencheExecution(MonInterface mi) {
		mi.execute();
	}
}
