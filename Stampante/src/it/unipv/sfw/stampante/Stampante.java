package it.unipv.sfw.stampante;

public class Stampante {
	private Cartuccia[] cartucce;
	
	public Stampante() {
		this.cartucce = new Cartuccia[3];
	}
	
	public void initStampante() {
		for (int i = 0; i < cartucce.length; i++) {
			cartucce[i] = new Cartuccia();
		}
	}
	
	public void printLevels() {
		for (int i = 0; i < cartucce.length; i++) {
			System.out.println(cartucce[i].getLevel()+"\n");
		}
	}
	
	public void subCartuccia(ColorEnum colore) {
		this.cartucce[colore.getIndex()].resetLevel();
	}
	
	public void print(Stampabile file) {
		double[] usage = file.inkUsage();
		for (int i = 0; i < cartucce.length; i++) {
			cartucce[i].setLevel(cartucce[i].getLevel() - usage[i]);
		}
	}
}
