package lt.bt.Testas.tryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Duomenu_iskaidymas_i_string_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\tryCatch\\Duomenys-try-catch.txt";	
		File file = new File(filePath);
		Scanner scan =null;		
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
		
		int numbersInFile = 0;
		int stringsInFile = 0;
		while (scan.hasNext()) {  
			try{
				int a = Integer.parseInt(scan.next());
				numbersInFile++;
			} catch (NumberFormatException e) {
				stringsInFile++;
			}
		}
		
		try {	
			scan = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
		}
		
		String[] dataArray = new String[numbersInFile+stringsInFile];	
		int b =0;
		while (scan.hasNextLine()) {
			dataArray[b]= scan.next();
			b++;
		}
		
		int[] intArray =new int[numbersInFile];
		String[] stringArray = new String[stringsInFile];
		
		int intIndex =0;
		int stringIndex =0;
		
		for (int i = 0; i<numbersInFile+stringsInFile; i++) {
			try {
				intArray[intIndex]=Integer.parseInt(dataArray[i]);
				intIndex++;
			} catch (NumberFormatException e) {
				stringArray[stringIndex] = dataArray[i];
				stringIndex++;				
			}			
		}
		
		print("Spausdinamos skaitines reiksmes:");
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]);
			if (i !=intArray.length-1) {
				System.out.print(", ");
			} else {
				System.out.print("\n");
			}			
		}
		
		print("Spausdinamos tekstines reiksmes:");
		for(int i=0; i<stringArray.length; i++) {
			System.out.print(stringArray[i]);
			if (i !=stringArray.length-1) {
				System.out.print(", ");
			} else {
				System.out.print("\n");
			}			
		}
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
}
