package it.unipv.sfw.stampante;

public class Rect extends Forma{
	private double base;
	private double altezza;
	private Color colore;

	public Rect(int base, int altezza, Color colore) {
		this.base = base;
		this.altezza = altezza;
		this.colore = colore;
	}
	
	public double perimetro() {
		return (base*2)+(altezza*2); 
	}
	
	public double area() {
		return base*altezza; 
	}
}
