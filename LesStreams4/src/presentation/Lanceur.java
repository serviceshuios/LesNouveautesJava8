package presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import metier.Facture;

public class Lanceur {

	public static void main(String[] args) {
		
List<Facture> factures = new ArrayList<Facture>();
		
		factures.add(new Facture("2021-18-05",4587,"Ets Huios"));
		factures.add(new Facture("2021-18-04",457,"Ets Poulaillon"));
		factures.add(new Facture("2021-18-03",587,"Ets Huios"));
		factures.add(new Facture("2021-18-02",4587,"Ets Poulaillon"));
		factures.add(new Facture("2021-18-01",4577788,"Ets Huios"));
		factures.add(new Facture("2020-18-12",25,"Ets Poulaillon"));
		factures.add(new Facture("2020-18-11",36974,"Ets Huios"));
		factures.add(new Facture("2020-18-10",4587932,"Ets Huios"));
		
		String resultat = factures
							.parallelStream()
							.filter(f->f.getTotal() > 500)
							.map(Facture::getNumero)
							.collect(Collectors.joining(":"));
		
		System.out.println("resultat : "+resultat);
		
		System.out.println("----------------------------------------------------------");
		resultat = factures
				.stream()
				.filter(f->f.getTotal() > 500)
				.parallel()
				.map(Facture::getNumero)
				.collect(Collectors.joining(":"));

		System.out.println("resultat : "+resultat);
		
		System.out.println("----------------------------------------------------------");
		
		factures
				.parallelStream()
				.filter(f->f.getTotal() > 500)
				.map(Facture::getNumero)
				.sequential()
				.forEach(System.out::println);

	}
}
