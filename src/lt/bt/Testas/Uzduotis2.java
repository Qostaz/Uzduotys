package lt.bt.Testas;

import java.util.Scanner;
import java.time.Year;

public class Uzduotis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Nurodykite gimimo metus:");
		int metai = reader.nextInt();
		int now = Year.now().getValue();
		//int dabar = 2018;
		int amzius = now-metai;
		System.out.println("Dabartinis amzius: " + amzius);
		if (amzius>=18) {
			System.out.println("Asmuo yra pilnametis");
		} else {
			System.out.println("Asmuo yra nepilnametis");
		}		
		reader.close();
	}

}
