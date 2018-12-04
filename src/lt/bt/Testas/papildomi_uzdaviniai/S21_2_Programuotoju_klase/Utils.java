package lt.bt.Testas.papildomi_uzdaviniai.S21_2_Programuotoju_klase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
	
	public static void writeToFile(List<Mokinys> mokiniuSarasas, String fileWrite) throws IOException {	
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Sudarytos klases mokiniu sarasas:\r\n");
		for (int i = 0; i<mokiniuSarasas.size(); i++) {
			bw.write(mokiniuSarasas.get(i).getVardasPavarde() + " " + mokiniuSarasas.get(i).getPrioritetas() + "\r\n");
		}	
		bw.close();	
		fw.close();
		System.out.println("Write done");
	}
	
	public static void printResult(List<Mokinys> mokiniuSarasas) {			
		System.out.println("Sudarytos klases mokiniu sarasas:");
		for (int i = 0; i<mokiniuSarasas.size(); i++) {
			System.out.println(mokiniuSarasas.get(i).getVardasPavarde() + " " + mokiniuSarasas.get(i).getPrioritetas());
		}
	}
	
	public static void sortData(List<Mokinys> mokiniuSarasas) {
	    for (int i = 0; i<mokiniuSarasas.size(); i++) {
	    	for (int j = i+1; j<mokiniuSarasas.size(); j++) {
	    		Mokinys obj1 = mokiniuSarasas.get(i);
	    		Mokinys obj2 = mokiniuSarasas.get(j);
	    		if (obj1.getPrioritetas() > obj2.getPrioritetas()) {
	    			mokiniuSarasas.set(i, obj2);
	    			mokiniuSarasas.set(j, obj1);
	    		}
	    	}
	    }
	}
	
	public static List<Mokinys> trimData(List<Mokinys> mokiniuSarasas, int maxNumber) {
		List<Mokinys> tempList = new ArrayList<Mokinys>();
		int count=0;
		while (count < maxNumber) {
			tempList.add(count, mokiniuSarasas.get(count));
			count++;
		}
		return tempList;		
	}
	
	public static void addNewMokinys(List<Mokinys> mokiniuSarasas, String vardasPavarde, int prioritetas ) {
		Mokinys temp = new Mokinys(vardasPavarde, prioritetas);
		mokiniuSarasas.add(temp);
	}
	
	public static void removeMokinys (List<Mokinys> mokiniuSarasas, int indexNumber) {		
		mokiniuSarasas.remove(indexNumber);
	}
	

}
