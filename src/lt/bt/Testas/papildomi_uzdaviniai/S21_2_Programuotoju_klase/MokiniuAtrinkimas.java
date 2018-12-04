package lt.bt.Testas.papildomi_uzdaviniai.S21_2_Programuotoju_klase;

import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;
import java.util.*;

public class MokiniuAtrinkimas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Duomenys_programuotoju_klase.txt";
		Scanner reader = Utils.startScanner(filePath);
		
		int maxMokiniu = reader.nextInt();
		int totalMokiniu = reader.nextInt();
		
		List<Mokinys> mokiniuSarasas = new ArrayList<Mokinys>();
		for (int i =0; i<totalMokiniu; i++) {
			Mokinys temp = new Mokinys(reader.next(), reader.nextInt());		
			mokiniuSarasas.add(i, temp);
		}	
	
		//Prideda nauja mokini
		Utils.addNewMokinys(mokiniuSarasas, "A_Kostas", 1);		
		
		//Pasalina mokini
		Utils.removeMokinys(mokiniuSarasas, 2);
		
		Collections.sort(mokiniuSarasas);  //sort su Comparable interface
		//Utils.sortData(mokiniuSarasas);  //sort su metodu
		List<Mokinys> atrinktiMokiniai = Utils.trimData(mokiniuSarasas, maxMokiniu);		
				
		Utils.printResult(atrinktiMokiniai);
		String fileWrite = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Rezultatai_programuotoju_klase.txt";
		Utils.writeToFile(atrinktiMokiniai, fileWrite);
		
		reader.close();
	}

}
