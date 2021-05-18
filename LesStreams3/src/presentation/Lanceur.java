package presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		//affiche toutes les factures
		factures.stream().forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		//affiche toutes les factures inférieures à 5000
		factures
			.stream()
			.filter(f->f.getTotal() <500)
			.forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		//Total des factures inférieures à 10000
		Optional resultat = factures
			.stream()
			.map(f->f.getTotal())
			.filter(d->d<10000)
			.reduce(Double::sum);
		
		System.out.println("Total = "+resultat.get());

	}

}
