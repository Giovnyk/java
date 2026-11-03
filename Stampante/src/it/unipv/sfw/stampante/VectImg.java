package it.unipv.sfw.stampante;

public class VectImg {
	private Forma forme[];
	
	public VectImg(Forma forme[]) {
		this.forme = forme;
	}
	
	public int[] colorUsage() {
		int usage[] = {0, 0, 0};
		for (Forma f : forme) {
			for (int j = 0; j < usage.length; j++) {
				usage[j] -= (f.area() * f.getColor().getRgb()[j]);
				System.out.println(usage[j]);
			}
		}
		return usage;
	}
}
