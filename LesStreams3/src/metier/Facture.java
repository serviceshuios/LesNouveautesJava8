package metier;

public class Facture {

	private String numero;
	private double total;
	private String client;
	public Facture(String numero, double total, String client) {
		super();
		this.numero = numero;
		this.total = total;
		this.client = client;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Facture [numero=" + numero + ", total=" + total + ", client=" + client + "]";
	}
	
	
}
