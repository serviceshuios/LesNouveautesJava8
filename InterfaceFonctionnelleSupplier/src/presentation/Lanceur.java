package presentation;

import java.util.function.IntSupplier;

import metier.Entiers;
import metier.Fibonacci;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parcours(Fibonacci::suivante);
		System.out.println("-------------------------------------");
		parcours(Entiers::get);
	}
	
	public static void parcours(IntSupplier f) {
		for(int i=0;i<5;i++) {
			System.out.println("Suivant : "+f.getAsInt());
		}
	}

}
