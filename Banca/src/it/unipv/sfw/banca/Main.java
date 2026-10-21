package it.unipv.sfw.banca;

public class Main {

	public static void main(String[] args) {
		
		Banca banca1 = new Banca("kebe", 10);
		
		Conto conto1 = banca1.addConto("giovanni", "leone", "AAA", "AAAAAAAA");

		conto1.deposita(100);
		System.out.println(conto1.getSaldo());
		conto1.preleva(50);
		System.out.println(conto1.getSaldo());
		conto1.preleva(100);
		System.out.println(conto1.getSaldo());
	}

}
