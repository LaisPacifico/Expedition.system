package interfa.exp;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Expedition;
import interfa.exp.exemple.Exemple;

public class GraphicInterface {
	
	AuxGiADD auxGiAdd = 		new AuxGiADD();
	AuxGiRemove auxGiRemove = 	new AuxGiRemove();
	AuxGiChange auxGiChance = 	new AuxGiChange();
	AuxGiShow auxGiShow = 		new AuxGiShow();
	
	
	Expedition expedition;
	
	

	public GraphicInterface(Expedition expedition) {
		this.expedition = expedition;
	}

	public void mainMenu(Scanner tc) {
		int choice = 0;
		while (choice != 6) {

			System.out.println("===========Menu Principal===========");
			System.out.println();
			System.out.println("Para adicionar conteúdo digite    (1)");
			System.out.println("Para mover conteúdo digite        (2)");
			System.out.println("Para Remover conteúdo digite      (3)");
			System.out.println("Para apresentar conteúdo digite   (4)");
			System.out.println("Para criar conteúdo automático    (5)");
			System.out.println("Para sair digite                  (6)");
			try {
				choice = tc.nextInt();
				if(choice == 1 || choice == 2 || choice == 3 ||  choice == 4 || choice == 5 ) {
					auxMenu(choice, tc);
				}
			} catch (InputMismatchException e) {
				tc.next();
				System.out.println("Opção Inválida");
				System.out.println();
			}
			
		}

	}
	
	private void auxMenu(int choice, Scanner tc) {
		switch (choice) {
		case 1:
			auxGiAdd.addMenu(tc, expedition);
			break;
		case 2:
			auxGiChance.changeMenu(tc, expedition);
			break;	
		case 3:
			auxGiRemove.removeMenu(tc, expedition);
			break;
		case 4:
			auxGiShow.ShowMenu(tc, expedition);
			break;
		case 5:
			Exemple exemple = new Exemple(expedition);
			break;

		default:
			break;
		}
	}

}
