package it.unipv.sfw.banca;

public class Conto {
	private String iban;
	private Persona proprietario;
	private double saldo;
	
	public Conto(String iban, Persona proprietario) {
		this.iban = iban;
		this.proprietario = proprietario;
	}
	
	public boolean preleva(double importo) {
		if (saldo < importo) { 
			System.out.println("Importo superiore al Saldo");
			return false; 
		}
		else if(importo < 0) { return false; }
		else { 
			saldo = saldo - importo;  
			return true;
		}
	}
	
	public boolean deposita(double importo) {
			saldo = saldo + importo;  
			return true;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getIban() {
		return iban;
	}
}