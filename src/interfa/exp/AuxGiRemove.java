package interfa.exp;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Expedition;

public class AuxGiRemove {
	
	public void removeMenu(Scanner tc,Expedition expedition) {
		int removeChoice = 0;
		System.out.println(">>>>>>> Menu Para Remover <<<<<<");
		System.out.println();
		System.out.println("Para remover gaveta digite   (1)");
		System.out.println("Para remover palete digite   (2)");
		System.out.println("Para remover caixa digite    (3)");
		System.out.println("Para sair digite             (4)");
		
		try {
			removeChoice = tc.nextInt();
			if(removeChoice == 1 || removeChoice == 2 || removeChoice == 3 ) {
				auxRemoveMenu(tc, removeChoice, expedition);
			}
		} catch (InputMismatchException e) {
			tc.next();
			System.out.println("Opção Invalida");
			System.out.println();
		}	
	}
	
	private void auxRemoveMenu(Scanner tc, int removeChoice, Expedition expedition) {
		switch (removeChoice) {
		case 1:
			deleteDrawer(tc, expedition);;
			break;
		case 2:
			deletePallet(tc, expedition);
			break;
		case 3:
			deleteBox(tc, expedition);
			break;

		default:
			break;
		}
	}
	
	private void deleteDrawer(Scanner tc,  Expedition expedition) {
		System.out.println("Selecion uma dessas gavetas para Remover");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.getIdDrawer(i) + " ");
		}
		System.out.println();
		int choice = tc.nextInt();
		expedition.deleteDrawer(choice);
		System.out.println("---Gaveta Removida com sucesso---");
		System.out.println();
	}
	
	public void deletePallet(Scanner tc, Expedition expedition) {
		System.out.println("Em qual gaveta o palete está?");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.getIdDrawer(i) + " ");
		}
		System.out.println();
		int choiceD = tc.nextInt();
		System.out.println("Escolha um palete para Remover");
		for (int i = 0; i < expedition.findDrawer(choiceD).returnSizePallet(); i++) {
			System.out.print(expedition.findDrawer(choiceD).getPallet(i).getIdPallet() + " ");
		}
		System.out.println();
		int choiceP = tc.nextInt();
		expedition.findDrawer(choiceD).removePallet(choiceP);
		System.out.println("---Palete Removido com sucesso---");
		System.out.println();
	}
	
	public void deleteBox(Scanner tc, Expedition expedition) {
		
		System.out.println("Em qual gaveta a caixa está?");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.getIdDrawer(i) + " ");
		}
		System.out.println();
		int choiceD = tc.nextInt();
		System.out.println("Em qual palete a caixa está?");
		for (int i = 0; i < expedition.findDrawer(choiceD).returnSizePallet(); i++) {
			System.out.print(expedition.findDrawer(choiceD).getPallet(i).getIdPallet() + " ");
		}
		System.out.println();
		int choiceP = tc.nextInt();
		System.out.println("Escolha uma caixa para Remover");
		for (int i = 0; i < expedition.findDrawer(choiceD).findPallet(choiceP).returnSizeBox(); i++) {
			System.out.print(expedition.findDrawer(choiceD).findPallet(choiceP).getBox(i).getIdBox() + " ");
		}
		System.out.println();
		int choiceB = tc.nextInt();
		expedition.findDrawer(choiceD).findPallet(choiceP).removeBox(choiceB);
		
		System.out.println("---Caixa Removida com sucesso---");
		System.out.println();
		
	}

}
