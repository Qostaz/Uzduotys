package lt.bt.Testas.ciklai;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite skaiciu nuo 1 iki 10: ");
		String number = reader.nextLine();
		switch (number) {
		case "1":
			System.out.println("Vienas");
			break;
		case "2":
			System.out.println("Du");
			break;
		case "3":
			System.out.println("Trys");
			break;
		case "4":
			System.out.println("Keturi");
			break;			
		case "5":
			System.out.println("Penki");
			break;
		case "6":
			System.out.println("Sesi");
			break;			
		case "7":
			System.out.println("Septyni");
			break;			
		case "8":
			System.out.println("Astuoni");
			break;			
		case "9":
			System.out.println("Devyni");
			break;			
		case "10":
			System.out.println("Desimt");
			break;			
		default:
			System.out.println("Nezinomas skaicius");
			break;
		}
		reader.close();
	}

}
