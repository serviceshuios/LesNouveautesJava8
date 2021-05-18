package metier;

public class PersonneMorale implements IPersonne {
	private String raisonsociale;
	private String siret;
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return raisonsociale;
	}

	@Override
	public String getSiret() {
		// TODO Auto-generated method stub
		return siret;
	}

}
