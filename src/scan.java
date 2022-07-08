import java.util.Scanner;

public class scan {
	static Scanner scanner = new Scanner(System.in);
	public scan() {
		
		System.out.println("List of evidence: ");
		System.out.println("FINGERPRINTS\r\n"
				+ "EMF LEVEL 5\r\n"
				+ "GHOST ORB\r\n"
				+ "FREEZING TEMPERATURES\r\n"
				+ "DOTS PROJECTOR\r\n"
				+ "SPIRIT BOX\r\n"
				+ "GHOST WRITING\r\n"
				+ " ");
		System.out.println("Welcome to my search list. Please type below the evidence you have found so far");
		System.out.println("What is your first evidence?");
		String e1 = scanner.nextLine();
		e1 = e1.toUpperCase();
		System.out.println("What is your second piece of evidence?");
		String e2 = scanner.nextLine();
		e2 = e2.toUpperCase();
		
		journal journal = new journal(e1, e2);
		
		int menu;
		System.out.println("Please choose one of the ghosts:");
		System.out.println("1: Banshee");
		System.out.println("2: Demon");
		System.out.println("3: Goryo");
		System.out.println("4: Phantom");
		System.out.println("5: Hantu");
		System.out.println("6: Jinn");
		System.out.println("7: Mare");
		System.out.println("8: Myling");
		System.out.println("9: Obake");
		System.out.println("10: Oni");
		System.out.println("11: Onryo");
		System.out.println("12: Poltergeist");
		System.out.println("13: Raiju");
		System.out.println("14: Revenant");
		System.out.println("15: Shade");
		System.out.println("16: Spirit");
		System.out.println("17: The Mimic");
		System.out.println("18: The Twins");
		System.out.println("19: Yokai");
		System.out.println("20: Wraith");	
		System.out.println("21: Yurei");
		System.out.println();
		System.out.println("Choose one of the following to obtain more information about cursed items:");
		System.out.println("22: Voodoo Doll");
		System.out.println("23: Haunted Mirror");
		System.out.println("24: Music box");
		System.out.println("25: Ouija Board");
		System.out.println("26: Tarot Cards");
		System.out.println("27: Summoning Circle");
		System.out.println();
		System.out.println("99: Exit");
		boolean quit = false;
		do {
			System.out.println();
			System.out.println("Please select: ");
			menu = scanner.nextInt(); 
			switch (menu) {
			case 1:
				journal.Banshee(e1,e2);
				break;
				
			case 2:
				journal.Demon(e1, e2);
				break;
			
			case 3:
				journal.Goryo(e1, e2);
				break;
				
			case 4:
				journal.Phantom(e1, e2);
				break;
			
			case 5:
				journal.Hantu(e1, e2);
				break;
				
			case 6:
				journal.Jinn(e1, e2);
				break;
				
			case 7:
				journal.Mare(e1, e2);
				break;
				
			case 8:
				journal.Myling(e1, e2);
				break;
				
			case 9:
				journal.Obake(e1, e2);
				break;
				
			case 10:
				journal.Oni(e1, e2);
				break;
				
			case 11:
				journal.Onryo(e1, e2);
				break;
				
			case 12:
				journal.Poltergeist(e1, e2);
				break;
				
			case 13:
				journal.Raiju(e1, e2);
				break;
				
			case 14:
				journal.Revenant(e1, e2);
				break;
				
			case 15:
				journal.Shade(e1, e2);
				break;
				
			case 16:
				journal.Spirit(e1, e2);
				break;
				
			case 17:
				journal.theMimic(e1, e2);
				break;
				
			case 18:
				journal.theTwins(e1, e2);
				break;
				
			case 19:
				journal.Yokai(e1, e2);
				break;
				
			case 20:
				journal.Wraith(e1, e2);
				break;
				
			case 21:
				journal.Yurei(e1, e2);
				break;
				
			case 22:
				journal.voodooDoll();
				break;
				
			case 23: 
				journal.hauntedMirror();
				break;
				
			case 24:
				journal.musicBox();
				break;
				
			case 25:
				journal.ouijaBoard();
				break;
				
			case 26:
				journal.tarotCards();
				break;
				
			case 27:
				journal.summoningCircle();
				break;
			
			case 99:
				quit = true;
				break;
				
			}
		}while (!quit);
		

}
}
