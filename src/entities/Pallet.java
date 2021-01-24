package entities;

import java.util.ArrayList;
import java.util.List;

public class Pallet {

	private static int counterP = 0;
	private int idPallet;

	private List<Box> boxes = new ArrayList();

	public Pallet() {
		this.counterP++;
		idPallet = counterP;
	}

	public Box getBox(int index) {
		return boxes.get(index);
	}

	public int getIdPallet() {
		return idPallet;
	}

	public void addBox() {
		boxes.add(new Box());
	}

	public void addBox(Box box) {
		boxes.add(box);
		
	}

	public void removeBox(int idBox) {
		for (int i = 0; i < boxes.size(); i++) {
			if (boxes.get(i).getIdBox() == idBox) {
				boxes.remove(i);
			}
		}
	}

	public Box findBox(int idBox) {
		for (Box box : boxes) {
			if (box.getIdBox() == idBox) {
				return box;
			}
		}
		return null;
	}

	public int returnSizeBox() {
		return boxes.size();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Palete ID: " + idPallet + "\n");
		sb.append(" Contém as caixas de ID: ");
		/*
		 * for (Box box : boxes) { sb.append(box + ","); }
		 */
		for (int i = 0; i < boxes.size() - 1; i++) {
			sb.append(boxes.get(i) + ", ");
		}
		if (boxes.size() > 0) {
			sb.append(boxes.get(boxes.size() - 1));
		}
		sb.append("\n");
		sb.append("\n");

		return sb.toString();
	}
}
