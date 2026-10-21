package it.unipv.sfw.stampante;

public class Quadrato extends Forma{
	private double lato;
	private Color colore;

	public Quadrato(int lato, Color colore) {
		this.lato = lato;
		this.colore = colore;
	}
	
	public double perimetro() {
		return lato*4; 
	}
	
	public double area() {
		return lato*lato; 
	}
}
