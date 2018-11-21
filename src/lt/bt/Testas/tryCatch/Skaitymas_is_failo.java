package lt.bt.Testas.tryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Skaitymas_is_failo {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\tryCatch\\notFound.txt";		
		Scanner scan =null ;
		boolean fileExists = false;

		
		while (!fileExists) {
			try {
				fileExists = true;
				File file = new File(filePath);
				scan = new Scanner(new FileReader(file));
				print("File read");
			} catch (FileNotFoundException e) {
				fileExists= false;
				print("Nurodyto failo nera. Prasome nurodyti failo pavadinimas su keliu iki jo:");
				filePath = scanForPath();         //C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\tryCatch\\numbers.txt
			}
		}
		
		int[] array = new int[100];	
		int b =0;
		while (scan.hasNextInt()) {
			array[b]= scan.nextInt();
			b++;
		}
		
		print("Faile esantys skaiciai");
		print(printArrayAsString(array));			      
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
