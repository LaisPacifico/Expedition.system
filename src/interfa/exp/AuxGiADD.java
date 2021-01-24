package interfa.exp;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Expedition;

public class AuxGiADD {

	public void addMenu(Scanner tc,Expedition expedition) {
		int addChoice = 0;
		System.out.println(">>>>>> Menu Para Adicionar <<<<<<<");
		System.out.println();
		System.out.println("Para adicionar gaveta digite   (1)");
		System.out.println("Para adicionar palete digite   (2)");
		System.out.println("Para adicionar caixa digite    (3)");
		System.out.println("Para sair digite               (4)");
		
		try {
			addChoice = tc.nextInt();
			if(addChoice == 1 || addChoice == 2 || addChoice == 3 ) {
				auxAddMenu(tc, addChoice, expedition);
			}
		} catch (InputMismatchException e) {
			tc.next();
			System.out.println("Opção Invalida");
			System.out.println();
		}	
	}
	
	private void auxAddMenu(Scanner tc, int addChoice, Expedition expedition) {
		switch (addChoice) {
		case 1:
			expedition.createDrawer();
			System.out.println("---Gaveta criada com sucesso---");
			System.out.println();
			break;
		case 2:
			addPallet(tc, expedition);
			break;
		case 3:
			addBox(tc, expedition);
			break;

		default:
			break;
		}
	}
	
	private void addPallet(Scanner tc, Expedition expedition ) {
		/*if(expedition.returnSizeDrawer() == 0) {
			expedition.createDrawer();
			System.out.println("---Gaveta criada com sucesso---");
		}*/
		System.out.println("Selecione uma dessas gavetas para adicionar o palete");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.findDrawer(i+1).getIdDrawer() + " ");
		}
		System.out.println();
		int choice = tc.nextInt();
		expedition.findDrawer(choice).addPallet();
		System.out.println("---Palete criado com sucesso---");
		System.out.println();
	}
	
	private void addBox(Scanner tc,  Expedition expedition) { 
		System.out.println("Selecione uma dessas gavetas onde irá a caixa");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.findDrawer(i+1).getIdDrawer() + " ");
		}
		int choiceP = tc.nextInt();
		
		if(expedition.findDrawer(choiceP).returnSizePallet() == 0) {
			expedition.findDrawer(choiceP).addPallet();
		}
		
		System.out.println("Selecione um desses paletes para adicionar a caixa");
		for (int i = 0; i < expedition.findDrawer(choiceP).returnSizePallet(); i++) {
			System.out.print(expedition.findDrawer(choiceP).getPallet(i).getIdPallet() + " ");
		}
		int choiceB = tc.nextInt();
		expedition.findDrawer(choiceP).findPallet(choiceB).addBox();
		System.out.println("---Caixa adicionada com sucesso---");
		System.out.println();
	}
}
