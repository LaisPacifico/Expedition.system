package interfa.exp;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Expedition;

public class AuxGiShow {
	
	public void ShowMenu(Scanner tc,Expedition expedition) {
		int showChoice = 0;
		
			System.out.println(">>>>>>>>>> Menu para Apresentar conteúdo <<<<<<<<<<<");
			System.out.println();
			System.out.println("Para apresentar conteúdo da expedição digite     (1)");
			System.out.println("Para apresentar conteúdo de uma gaveta digite    (2)");
			System.out.println("Para apresentar conteúdo de um palete digite     (3)");
		
		try {
			showChoice = tc.nextInt();
			if(showChoice == 1 || showChoice == 2 || showChoice == 3  ) {
				auxShowMenu(tc, showChoice, expedition);
			}
		} catch (InputMismatchException e) {
			tc.next();
			System.out.println("Opção Inválida");
			System.out.println();
		}	
	}

	private void auxShowMenu(Scanner tc, int showChoice, Expedition expedition) {
		switch (showChoice) {
		case 1:
			System.out.println(expedition.toString());
			break;
		case 2:
			showDrawer(tc, expedition);
			break;
		case 3:
			showBox(tc, expedition);
			break;

		default:
			break;
		}
		
	}
	private void showDrawer(Scanner tc, Expedition expedition) {
		
		System.out.println("De qual gaveta você gostaria de ver o conteúdo?");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.getIdDrawer(i) + " ");
		}
		System.out.println();
		int choiceD = tc.nextInt();
		System.out.println(expedition.findDrawer(choiceD).toString());
	}
	
	private void showBox(Scanner tc, Expedition expedition) {
		System.out.println("De qual gaveta você gostaria de ver o conteúdo?");
		for (int i = 0; i < expedition.returnSizeDrawer(); i++) {
			System.out.print(expedition.getIdDrawer(i) + " ");
		}
		System.out.println();
		int choiceD = tc.nextInt();
		
		System.out.println("De qual palete você gostaria de ver o conteúdo?");
		for (int i = 0; i < expedition.findDrawer(choiceD).returnSizePallet(); i++) {
			System.out.print(expedition.findDrawer(choiceD).getPallet(i).getIdPallet() + " ");
		}
		System.out.println();
		int choiceP = tc.nextInt();
		
		System.out.println(expedition.findDrawer(choiceD).findPallet(choiceP).toString());
	}
	

}
