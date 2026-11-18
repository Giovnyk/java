package it.unipv.sfw.stampante;

public enum ColorEnum {
	RED(0),
	GREEN(1),
	BLUE(2);

	private final int index;

	private ColorEnum(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}
}