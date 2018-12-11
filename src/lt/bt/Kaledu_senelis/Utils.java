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
		
		bw.write("Vardas, Pavardė, Adresas, Dovana" +"\r\n");
		for (int i = 0; i<dovanuSarasas.size(); i++) {
			bw.write(dovanuSarasas.get(i).getVardas() + ", " + dovanuSarasas.get(i).getPavarde() + ", " + dovanuSarasas.get(i).getAdresas() + ", " + dovanuSarasas.get(i).getDovana() +"\r\n");
		}		
	
		bw.close();	
		fw.close();
		System.out.println("Write done");
	}
	
	public static void writeToFileUzsakymas(List<Zaislas> zaislai) throws IOException {
		String fileWrite = enterPath();
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Žaislas, Kiekis" +"\r\n");
		for (int i = 0; i<zaislai.size(); i++) {
			bw.write(zaislai.get(i).getZaisloPavadinimas() + ", " + zaislai.get(i).getKiekis() +"\r\n");
		}		
	
		bw.close();	
		fw.close();
		System.out.println("Write done");
		
	}
	
	public static void checkForIfExist(List <Zaislas> sarasas, String name) {
		int count =0;
		if(!sarasas.isEmpty()) {
			for (Zaislas a : sarasas) {
				if (a.getZaisloPavadinimas().equals(name)) {
					a.setKiekis(a.getKiekis()+1);
					count++;							
				} 					
			}
			if (count == 0) {
				sarasas.add(new Zaislas(name, 1));
			}					
		} else {
			sarasas.add(new Zaislas(name, 1));
		}	
	}

}
