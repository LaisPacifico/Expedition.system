package program;

import java.util.Scanner;

import entities.Drawer;
import entities.Expedition;
import interfa.exp.GraphicInterface;

public class Application {

	public static void main(String [] args) {
		
		Scanner tc = new Scanner(System.in);
		Expedition expedition = new Expedition(); 
		GraphicInterface window = new GraphicInterface(expedition);	
		window.mainMenu(tc);
		
		System.out.println();

		//System.out.println("Escolha uma das opções a baixo:");
		
		/*Pallet palete = new Pallet();
		palete.addBox(5);
		System.out.println(palete.toString());
		palete.removeBox(3);
		System.out.println(palete.toString());
		System.out.println(palete.findBox(3));
		palete.addBox(5);
		System.out.println(palete.toString());
		
		Drawer gaveta = new Drawer();
		Drawer gaveta2 = new Drawer();
		gaveta.addPallet(2);
		System.out.println(gaveta.toString());
		gaveta2.addPallet(2);
		gaveta2.findPallet(4).addBox(5);
		//gaveta2.removePallet(3);
		System.out.println(gaveta2.toString());
		/*gaveta.removePallet(1);
		System.out.println(gaveta.toString());
		System.out.println(gaveta.findBox(2));*/

		
		
		
	}
}
