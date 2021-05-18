package presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> uneListe = new ArrayList<String>();
		
		uneListe.add("eddy");
		uneListe.add("christian");
		uneListe.add("zam");
		
		uneListe
			.stream()
			.filter(s -> s.length() <7)
			//.forEach(s -> System.out.println(s));
			.forEach(System.out::println);
		System.out.println("-----------------------------------");
		Stream.of("eddy","christian","zam")
			.filter(s -> s.length() <7)
			.map(String::toUpperCase)
			.forEach(System.out::println);
		System.out.println("-----------------------------------");
		Optional somme = Stream.of("toto","eddy","christian","zam")
			.filter(s -> s.length() <7)
			.map(s->s.length())
			.reduce((l1,l2)-> l1+l2);
		
		System.out.println("Somme : "+somme.get());
	}

}
