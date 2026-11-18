package it.unipv.sfw.banca;

public abstract class Conto {
	private String codiceFiscale;
	private String iban;
	private double saldo;
	
	// TODO: Gestisci eccezioni
	public abstract void operazione(double importo);
}
