package lt.bt.Kaledu_senelis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import lt.bt.Testas.objektai_temperatura.Matavimai;
import lt.bt.Testas.objektai_temperatura.Temperatura;

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
				reader = new Scanner(new FileReader(file));
			} catch (FileNotFoundException e) {
				fileExists = false;
				System.out.println("Nurodytas failas neegzistuoja");
				newFilePath = enterPath();
			}
		}
		return reader;
	}
	
	public static void writeToFile(List<DovanuSarasas> dovanuSarasas) throws IOException {		
		String fileWrite = enterPath();
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i = 0; i<dovanuSarasas.size(); i++) {
			bw.write(dovanuSarasas.get(i).getVardas() + ", " + dovanuSarasas.get(i).getPavarde() + ", " + dovanuSarasas.get(i).getAdresas() + ", " + dovanuSarasas.get(i).getDovana() +"\r\n");
		}		
	
		bw.close();	
		fw.close();
		System.out.println("Write done");
	}

}
