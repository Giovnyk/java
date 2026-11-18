package it.unipv.sfw.stampante;

public class Cartuccia {
	private double level;
	
	public Cartuccia() {
		this.level = 100000;
	}

	public void setLevel(double level) {
		this.level = level;
	}

	public double getLevel() {
		return level;
	}

	public void resetLevel() {
		this.level = 100000;
	}

}
