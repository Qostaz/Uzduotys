package lt.bt.Testas.tryCatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Skaitymas_is_failo {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\tryCatch\\notFound.txt";
		String filePath2 ="";
		File file = new File(filePath);
		Scanner scan = null;
		boolean fileExists = false;
		while (!fileExists) {
			try {
				fileExists = true;
				scan = new Scanner(new FileReader(file));
				

				
			} catch (FileNotFoundException e) {
				
				print("Nurodyto failo nrea. Prasome nurodyti failo pavadinimas su keliu iki jo:");
				filePath = scanForPath();
				print(filePath);
				fileExists= false;
				//scan.close();
				//return;
				
			}
		}
		
		
		
		
		int[] array = new int[100];		
		int b =0;
		while (scan.hasNextLine()) {
			array[b]= scan.nextInt();
			b++;
		}	
		
		print(printArrayAsString(array));
		
		
		
		scan.close();
		
		


		/*while (true) {
			try {
				scan = new Scanner(new FileReader(file));	
				while (scan.hasNext()) {
					array[b]= scan.nextInt();
					b++;
				}
				printArrayAsString(array);
			} catch (FileNotFoundException e) {
				print("Nurodyto failo nrea. Prasome nurodyti failo pavadinimas su keliu iki jo:");
				filePath = scanForPath();

				
			}
		}*/
		print("File read");

		
		
		

			      // C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\tryCatch\\numbers.txt

		}
		
	

		

	
	
	
	private static void print(String text) {
		System.out.println(text);
	}
	
	
	private static String scanForPath () {
		Scanner reader = new Scanner(System.in);
		String path = reader.next();
		reader.close();
		return path;
	}
	
	private static int[] getIntArrayFromFile(String filePath, int arrayLength) {
		String filep = filePath;
		int number = arrayLength;
		File file = new File(filep);
		int[] array = new int[arrayLength];	
		int b =0;
		try (Scanner scan = new Scanner(new FileReader(file))) {
			while (scan.hasNext()) {
				array[b]= scan.nextInt();
				b++;
			}			
		} catch (FileNotFoundException e) {
			print("Nurodyto failo nrea. Prasome nurodyti failo pavadinimas su keliu iki jo:");
			filep = scanForPath();
			getIntArrayFromFile(filep, number);
		}
		

		return array;
	}
	
	
	private static String printArrayAsString(int[] array) {
		String intAsString = "";
		for(int i=0; i<array.length; i++) {
			intAsString += array[i];
			if (i !=array.length-1) {
				intAsString += ", ";
			}
		}
		return intAsString;
	}

}
