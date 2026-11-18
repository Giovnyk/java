package it.unipv.sfw.banca;

public class ContoCorrente {
	private String iban;
	private String codiceFiscale;
	private double saldo;
	
	public ContoCorrente(Persona proprietario) {
		this.codiceFiscale = proprietario.getcodiceFiscale();
	}
	
	public void operazione(double importo) {
		saldo += importo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getIban() {
		return iban;
	}
	
}