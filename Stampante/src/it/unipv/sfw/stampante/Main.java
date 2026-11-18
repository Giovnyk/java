package it.unipv.sfw.stampante;

public class Main {

	public static void main(String[] args) {
		Color red = new Color(255, 0, 0);
		Color green = new Color(0, 255, 0);
		Color blue = new Color(0, 0, 255);
		Color c1 = new Color(128, 64, 255);

		Rect[] r1 = {new Rect(15, 10, red), new Rect(20, 10, blue), new Rect(20, 10, c1)};

		VectImg img1 = new VectImg(r1);

		Stampante s1 = new Stampante();
		
		s1.initStampante();
		s1.print(img1);
		
	}

}
