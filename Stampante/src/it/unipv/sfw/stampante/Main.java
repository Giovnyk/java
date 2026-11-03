package it.unipv.sfw.stampante;

public class Main {

	public static void main(String[] args) {
		Color red = new Color(255, 0, 0);
		Color green = new Color(0, 255, 0);
		Color blue = new Color(0, 0, 255);

		Rect[] r1 = {new Rect(15, 10, red)};

		VectImg img1 = new VectImg(r1);

		Cartuccia cR = new Cartuccia(red);
		Cartuccia cG = new Cartuccia(green);
		Cartuccia cB = new Cartuccia(blue);

		Cartuccia[] cartucce = {cR, cG, cB};
		
		Stampante s1 = new Stampante(cartucce);
		
		

		
		img1.colorUsage();
	}

}
