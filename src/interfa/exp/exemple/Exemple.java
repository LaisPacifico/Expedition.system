package interfa.exp.exemple;

import entities.Expedition;

public class Exemple {
	
	Expedition expedition;
	
	public Exemple(Expedition expedition) {
		this.expedition = expedition;
		init();
	}
	
	public void init() {
		expedition.createDrawer();
		expedition.createDrawer();
		expedition.findDrawer(1).addPallet();
		expedition.findDrawer(1).addPallet();
		expedition.findDrawer(2).addPallet();
		expedition.findDrawer(2).addPallet();
		expedition.findDrawer(3).addPallet();
		expedition.findDrawer(3).addPallet();
		expedition.findDrawer(1).findPallet(1).addBox();
		expedition.findDrawer(1).findPallet(1).addBox();
		expedition.findDrawer(1).findPallet(2).addBox();
		expedition.findDrawer(1).findPallet(2).addBox();
		expedition.findDrawer(2).findPallet(3).addBox();
		expedition.findDrawer(2).findPallet(3).addBox();
		expedition.findDrawer(2).findPallet(4).addBox();
		expedition.findDrawer(2).findPallet(4).addBox();
		expedition.findDrawer(3).findPallet(5).addBox();
		expedition.findDrawer(3).findPallet(5).addBox();
		expedition.findDrawer(3).findPallet(6).addBox();
		expedition.findDrawer(3).findPallet(6).addBox();
		System.out.println("---Conteúdo automático criado com sucesso---");
		System.out.println();
	}
}
