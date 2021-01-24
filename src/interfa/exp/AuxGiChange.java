package interfa.exp;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Box;
import entities.Expedition;
import entities.Pallet;

public class AuxGiChange {
	
	public void changeMenu(Scanner tc,Expedition expedition) {
		int changeChoice = 0;
		
			System.out.println(">>>>>> Menu Para Mover <<<<<<<");
			System.out.println();
			System.out.println("Para mover palete digite   (1)");
			System.out.println("Para mover caixa digite    (2)");
		
		try {
			changeChoice = tc.nextInt();
			if(changeChoice == 1 || changeChoice == 2  ) {
				auxChangeMenu(tc, changeChoice, expedition);
			}
		} catch (InputMismatchException e) {
			tc.next();
			System.out.println("Opção Invalida");
			System.out.println();
		}	
	}
	
	private void auxChangeMenu(Scanner tc, int changeChoice, Expedition expedition) {
		switch (changeChoice) {
		case 1:
			movePallet(tc, expedition);
			break;
		case 2:
			moveBox(tc, expedition);
			break;
			
		default:
			break;
		}
	}
	
	private void movePallet(Scanner tc, Expedition expedition) {
		
		System.out.println("Em qual gaveta está o palete que você deseja mover?");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.getIdDrawer(i) + " ");
		}
		System.out.println();
		int choiceD = tc.nextInt();
		System.out.println("Qual desse palete você deseja mover?");
		for (int i = 0; i < expedition.findDrawer(choiceD).returnSizePallet(); i++) {
			System.out.print(expedition.findDrawer(choiceD).getPallet(i).getIdPallet() + " ");
		}
		System.out.println();
		int choiceP = tc.nextInt();
		Pallet auxPallet = expedition.findDrawer(choiceD).findPallet(choiceP);
		
		System.out.println("Para qual gaveta você gostaria de mover o palete?");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.getIdDrawer(i) + " ");
		}
		System.out.println();
		int choiceD2 = tc.nextInt();
		
		expedition.findDrawer(choiceD2).addPallet(auxPallet);
		expedition.findDrawer(choiceD).removePallet(choiceP);
		System.out.println("---Palete movido com sucesso---");
		System.out.println();
	}
	
	private void moveBox(Scanner tc, Expedition expedition) {
		System.out.println("Em qual gaveta está a caixa que você deseja mover?");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.getIdDrawer(i) + " ");
		}
		System.out.println();
		int choiceD = tc.nextInt();
		System.out.println("Em qual desses palete esta a caixa que você deseja mover?");
		for (int i = 0; i < expedition.findDrawer(choiceD).returnSizePallet(); i++) {
			System.out.print(expedition.findDrawer(choiceD).getPallet(i).getIdPallet() + " ");
		}
		System.out.println();
		int choiceP = tc.nextInt();
		
		System.out.println("Qual dessas caixas você deseja mover?");
		for (int i = 0; i < expedition.findDrawer(choiceD).findPallet(choiceP).returnSizeBox(); i++) {
			System.out.print(expedition.findDrawer(choiceD).findPallet(choiceP).getBox(i).getIdBox() + " ");
		}
		System.out.println();
		int choiceB = tc.nextInt();
		Box auxBox = expedition.findDrawer(choiceD).findPallet(choiceP).findBox(choiceB);
		
		System.out.println("Para qual gaveta você deseja mover a caixa?");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.getIdDrawer(i) + " ");
		}
		System.out.println();
		int choiceD2 = tc.nextInt();
		
		System.out.println("Para qual palete você deseja mover a caixa");
		for (int i = 0; i < expedition.findDrawer(choiceD2).returnSizePallet(); i++) {
			System.out.print(expedition.findDrawer(choiceD2).getPallet(i).getIdPallet() + " ");
		}
		System.out.println();
		int choiceP2 = tc.nextInt();
		
		expedition.findDrawer(choiceD2).findPallet(choiceP2).addBox(auxBox);
		expedition.findDrawer(choiceD).findPallet(choiceP).removeBox(choiceB);
		System.out.println("---Caixa movida com sucesso---");
		System.out.println();
	}


}
