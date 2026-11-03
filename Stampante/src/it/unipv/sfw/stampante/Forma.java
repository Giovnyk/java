package it.unipv.sfw.stampante;

public abstract class Forma {
	private Color colore;
	
	public abstract double perimetro();
	public abstract double area();
	
	
	public Color getColor() {
		return colore;
	}
}
