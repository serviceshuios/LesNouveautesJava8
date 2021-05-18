package metier;

public interface IPersonne {
	String getNom();
	default String getSiret() { return "Pas de Siret";};
}
