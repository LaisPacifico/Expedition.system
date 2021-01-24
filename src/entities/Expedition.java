package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Expedition {
	
	private List<Drawer> drawers = new ArrayList<Drawer>();
	
	public Expedition() {
		createDrawer();
	}
	
	public int getIdDrawer(int index) {
		return drawers.get(index).getIdDrawer();
	}
	
	public void createDrawer() {
			drawers.add(new Drawer());
	}
	
	public void deleteDrawer(int idDrawer) {
		for (int i = 0; i < drawers.size(); i++) {
			if (drawers.get(i).getIdDrawer() == idDrawer) {
				drawers.remove(i);
			}
		}
	}
	
	public Drawer findDrawer(int idDrawer) {//retorna uma gaveta que tiver o ID igual o do parametro
		for (Drawer drawer : drawers) {
			if(drawer.getIdDrawer() == idDrawer) {
				return drawer;
			}
		}
		return null;
	}

	public int returnSizeDrawer() {
		return drawers.size();
	}
	
	public Pallet selectionPallet(int idPallet) {
		for (Drawer drawer : drawers) {
			for (int i = 0; i < drawer.returnSizePallet(); i++) {
				if(drawer.getPallet(i+1).getIdPallet() == idPallet) {
					return drawer.findPallet(idPallet);
				}
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Resumo da EXPEDIÇÃO \n" + drawers ;
	}

	
	

}