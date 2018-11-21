package lt.bt.Testas.funkcijos;

import java.io.IOException;
import java.util.Scanner;

public class Uzduotis5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] array = {3, 4, 5, 7, 4, 22, 11, 3, 5, 6, 6};
		print("Iveskite skaiciu");
		int number = scanForInt();
		print("Skaicius " + number + " masyve rastas " +  checkForNumber(array, number) + " kart.");
	}
	
	private static int scanForInt () {
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		reader.close();
		return number;
	}	

	
	private static int checkForNumber(int[] array, int number) {		
		int pasikartojimas = 0;
		for (int i = 0; i<array.length; i++) {	
				if(array[i]==number) {
					pasikartojimas++;						
				}				
		}		
		if(pasikartojimas ==0) {
			return 0;
		} else {
			return pasikartojimas;
		}
	}
	
	private static void print(String text) throws IOException {
		System.out.println(text);
	}

}
