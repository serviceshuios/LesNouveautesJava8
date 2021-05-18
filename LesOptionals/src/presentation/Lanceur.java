package presentation;

import java.util.Optional;

public class Lanceur {

	public static void main(String[] args) {
		/*int donnees = trouver("hello");
		
		if(donnees ==-1040) {
			// traitement spécial
		}
		else
		{
			// faire le boulot
		}*/
		Optional donnees = trouver("hello");
		
		if(donnees.isPresent()) {
			System.out.println("Date "+donnees.get());
		}
		else 
		{
			System.out.println("absence");
		}
		
        donnees = trouver("bonjour");
		
		if(donnees.isPresent()) {
			System.out.println("Date "+donnees.get());
		}
		else 
		{
			System.out.println("absence");
		}
	}
	
	public static Optional trouver(String str) {
		if(str=="bonjour")
			return Optional.of(1);
		else {
			return Optional.empty();
		}
	}

}
