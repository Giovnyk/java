package it.unipv.sfw.stampante;

public class VectImg implements Stampabile{
	private Forma forme[];
	
	public VectImg(Forma forme[]) {
		this.forme = forme;
	}
	
	public double[] inkUsage() {
		double[] usage = {0, 0, 0};
		for (Forma f : forme) {
			for (int j = 0; j < usage.length; j++) {
				usage[j] += (f.area() * f.getColor().getRgb()[j]);
			}
		}
		for (int i = 0; i < usage.length; i++) {
			System.out.println(usage[i]);
		}
		return usage;
	}
}
