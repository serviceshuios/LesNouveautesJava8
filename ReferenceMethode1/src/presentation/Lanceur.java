package presentation;

import java.util.Arrays;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
		Personne [] leTableau = new Personne[2];
		
		leTableau[0]=new Personne("Eddy",44);
		leTableau[1]=new Personne("Elise",42);
		
		System.out.println("---AVANT LE TRI----");
		
		for (Personne personne : leTableau) {
			System.out.println(personne);
		}
		
		Arrays.sort(leTableau,Personne::compareA);
		System.out.println("---APRES LE TRI----");
		for (Personne personne : leTableau) {
			System.out.println(personne);
		}
	}

}
