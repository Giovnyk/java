package it.unipv.sfw.banca;

public class Banca {
	private String nome;
	private int maxConti;
	private Conto conti[];
	private int contiAttivi;
	private String radIban;
	
	public Banca(String nome, int maxConti) {
		this.nome = nome;
		this.maxConti = maxConti;
		conti = new Conto[maxConti];
	}
	
	public Conto addConto(String nome, String cognome, String codiceFiscale, String iban) {
		conti[contiAttivi] = new Conto(iban, new Persona(nome, cognome, codiceFiscale));
		contiAttivi++;	
		return conti[contiAttivi - 1];
	}

	public double totSaldi() {
		double totSaldi = 0;
		for (int i = 0; i < conti.length; i++) {
			totSaldi = totSaldi + conti[i].getSaldo();
		}	
		return totSaldi;
	}
	
	public Conto getConto(String iban) {
		for (int i = 0; i < conti.length; i++) {
			if (conti[i].getIban() == iban) { return conti[i]; }
		}
		return null;
	}
	
	public void operazione(Banca banca, String iban, double importo) {
		if (importo > 0) { banca.getConto(iban).deposita(importo); }
		else {  banca.getConto(iban).preleva(importo); }
	}
}
