package it.unipv.sfw.stampante;

public class Cerchio {
	private double raggio;
	private Color colore;

	public Cerchio(int raggio, Color colore) {
		this.raggio = raggio;
		this.colore = colore;
	}
	
	public double perimetro() {
		return 6.28*raggio; 
	}
	
	public double area() {
		return 3.14*raggio*raggio; 
	}
}
