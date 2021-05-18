package presesntation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste = new ArrayList<String>();
		liste.add("eddy");
		liste.add("christian");

		Stream s = liste.stream();
		s.forEach(System.out::println);
		System.out.println("-----------------------------------");
		
		Stream.of("eddy","christian").forEach(System.out::println);
		System.out.println("-----------------------------------");
		
		Stream.Builder b = Stream.builder();
		b.accept("eddy");
		b.accept("christian");
		
		b.build().forEach(System.out::println);
		System.out.println("-----------------------------------");
		
		DoubleStream.Builder db = DoubleStream.builder();
		db.accept(4.5);
		db.accept(7.8);
		db.build().forEach(System.out::println);

	}

}
