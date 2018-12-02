package lt.bt.Testas.papildomi_uzdaviniai.S21_2_Programuotoju_klase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Utils {
	
	
	
	public static String enterPath() {		
		System.out.println("Prasome ivesti kelia iki failo:");
		String filePath = startConsoleScanner().next();
		//startConsoleScanner().close();
		return filePath;
	}
	
	public static Scanner startConsoleScanner()  {
		Scanner consoleScanner = new Scanner(System.in);
		return consoleScanner;
	}
	
	public static Scanner startScanner(String filePath) {
		String newFilePath = filePath;
		Scanner reader= null;
		boolean fileExists = false;
		while (!fileExists) {
			try {
				fileExists = true;
				File file = new File(newFilePath);
				reader = new Scanner((new FileReader(file)));
			} catch (FileNotFoundException e) {
				fileExists = false;
				System.out.println("Nurodytas failas neegzistuoja");
				newFilePath = enterPath();
			}
		}
		return reader;
	}
	
	public static void writeToFile(Mokinys[] mokiniai, String fileWrite) throws IOException {	
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Sudarytos klases mokiniu sarasas:\r\n");
		for (int i = 0; i<mokiniai.length; i++) {
			bw.write(mokiniai[i].vardasPavarde + " " + mokiniai[i].prioritetas + "\r\n");
		}	
		bw.close();	
		fw.close();
		System.out.println("Write done");
	}
	
	public static void printResult(Mokinys[] mokiniai) {			
		System.out.println("Sudarytos klases mokiniu sarasas:");
		for (int i = 0; i<mokiniai.length; i++) {
			System.out.println(mokiniai[i].vardasPavarde + " " + mokiniai[i].prioritetas);
		}
	}
	
	public static void sortData(Mokinys[] mokiniai) {
	    for (int i = 0; i<mokiniai.length; i++) {
	    	for (int j = i+1; j<mokiniai.length; j++) {
	    		Mokinys obj1 = mokiniai[i];
	    		Mokinys obj2 = mokiniai[j];
	    		if (obj1.prioritetas > obj2.prioritetas) {
	    			mokiniai[i] = obj2;
	    			mokiniai[j] = obj1;
	    		}
	    	}
	    }
	}
	
	public static Mokinys[] trimData(Mokinys[] mokiniai, int maxNumber) {
		Mokinys[] tempArray = new Mokinys[maxNumber];
		int count=0;
		while (count < maxNumber) {
			tempArray[count] = mokiniai[count];
			count++;
		}
		return tempArray;		
	}
	
	public static Mokinys[] addNewMokinys (Mokinys[] mokiniai, String vardasPavarde, int prioritetas ) {
		Mokinys[] tempArray = new Mokinys[mokiniai.length+1];
		for (int i = 0; i<mokiniai.length; i++) {
			tempArray[i] = mokiniai[i];
		}
		tempArray[mokiniai.length+1] = new Mokinys();
		tempArray[mokiniai.length+1].vardasPavarde = vardasPavarde;
		tempArray[mokiniai.length+1].prioritetas = prioritetas;
		return tempArray;
	}
	
	public static Mokinys[] removeMokinys (Mokinys[] mokiniai, int indexNumber) {
		Mokinys[] tempArray = new Mokinys[mokiniai.length-1];
		int count =0;
		for (int i = 0; i<mokiniai.length; i++) {
			if (i != indexNumber) {
				tempArray[count] = mokiniai[i];
				count++;
			}
		}
		return tempArray;
	}
	

}
