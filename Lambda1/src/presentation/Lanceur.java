package presentation;

interface MonInterface {
	void print(String s);
}

//obligatoire avant java 8
class MonInterfaceImpl implements MonInterface {

	@Override
	public void print(String s) {
		System.out.println(s);
		
	}
	
}
public class Lanceur {
	
	public static void affiche(MonInterface printer) {
		printer.print("Coucou");
	}

	public static void main(String[] args) {
		// avec lambda
		System.out.println("AVEC LAMBDA:");
		affiche(s->System.out.println(s));
		//sans lamdba
		System.out.println("SANS LAMBDA:");
		affiche(new MonInterfaceImpl());
	}

}
