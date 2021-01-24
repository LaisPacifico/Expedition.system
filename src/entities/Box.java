package entities;

public class Box {
	
	private static int counterB = 0;
	private int idBox;
	
	public Box() {
		this.counterB++;
		this.idBox = counterB;
	}

	public int getIdBox() {
		return idBox;
	}
	
	public String toString() {
		return "" + idBox;
	}

}
