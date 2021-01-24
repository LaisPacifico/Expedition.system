package entities;


import java.util.ArrayList;
import java.util.List;

public class Drawer {
	private static int counterD = 0;
	private int idDrawer;
	
	List<Pallet> pallets = new ArrayList();
	
	public Drawer() {
		this.counterD++;
		this.idDrawer = counterD;
	}
	
	public int getIdDrawer() {
		return idDrawer;
	}
	public Pallet getPallet(int index) {
		return pallets.get(index);
	}
	
	/*public Pallet getPalletID(int idPallet) {
		return pallets.;
	}*/

	public void addPallet() {
			pallets.add(new Pallet());
		
	}
	
	public void addPallet(Pallet pallet) {
		pallets.add(pallet);
	
}
	
	public void removePallet(int idPallet) {
		for (int i = 0; i < pallets.size(); i++) {
			if(pallets.get(i).getIdPallet() == idPallet) {
				pallets.remove(i);
			}
		}
	}
	
	public Pallet findPallet(int idPallet) {// retorna um palete com id igual ao parametro
		for (Pallet pallet : pallets) {
			if(pallet.getIdPallet() == idPallet) {
				return pallet;
			}
		}
		return null;
	}
	
	public int returnSizePallet() {
		return pallets.size();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Gaveta ID: " + idDrawer + "\n");
		for (Pallet pallet : pallets) {
			sb.append(" " + pallet);
		}
		return sb.toString();
	}
	
	
	

}
