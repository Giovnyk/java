package it.unipv.sfw.stampante;

public class Color {
	private int r;
	private int g;
	private int b;

	
	public Color(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public int[] getRgb() {
		int[] rgb = {r/255, g/255, b/255};
		return rgb;
	}
}
