package it.unipv.sfw.stampante;

public class Cartuccia {
	
	private Color colore;
	private double level;
	
	public Cartuccia(Color colore) {
		this.colore = colore;
		this.level = 100000;
	}

	public Color getColore() {
		return colore;
	}

	public void setlevel(double level) {
		this.level = level;
	}

	

}
