package lt.bt.Testas.tryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Skaiciaus_is_masyvo_grazinimas {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\tryCatch\\numbers.txt";	
		File file = new File(filePath);
		Scanner scan =null ;
		
		boolean fileExists = false;	
		
		while (!fileExists) {
			try {
				fileExists = true;
				file = new File(filePath);
				scan = new Scanner(new FileReader(file));
				print("File read");
			} catch (FileNotFoundException e) {
				fileExists= false;
				print("Nurodyto failo nera. Prasome nurodyti failo pavadinimas su keliu iki jo:");
				filePath = scanForPath();        
			}
		}
		
		int linesInFile = 0;		
		while (scan.hasNextInt()) {
			scan.nextInt();
			linesInFile++;
		}
		
		try {	
			scan = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
		}

		int[] array = new int[linesInFile];	
		int b =0;
		while (scan.hasNextInt()) {
			array[b]= scan.nextInt();
			b++;
		}
				
		printNumberFromArray(array);
		scan.close();
	}	
	
	
	private static void print(String text) {
		System.out.println(text);
	}
	
	
	private static String scanForPath () {
		Scanner reader = new Scanner(System.in);
		String path = reader.next();
		//reader.close();
		return path;
	}
	
	
	private static void printNumberFromArray(int[] array) {
		Scanner reader = null;
		try {
			reader = new Scanner(System.in);
			print("Pasirinkite skaiciu kuri norite atspausdinti:");
			int selection = reader.nextInt();
			int arrayIndex = selection - 1 ;
			print(String.valueOf(array[arrayIndex]));
		} catch (ArrayIndexOutOfBoundsException e){
			print("Pasirinktas skaicius nera numatytame intervale. Pasirinktie skaiciu is intervalo [1,2,...99,100] ir bandykite dar karta.");
			printNumberFromArray(array);
		}
		reader.close();
	}
}
