package lt.bt.Testas.papildomi_uzdaviniai.S21_2_Programuotoju_klase;

import java.io.IOException;
import java.util.Scanner;

public class MokiniuAtrinkimas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Duomenys_programuotoju_klase.txt";
		Scanner reader = Utils.startScanner(filePath);
		
		int maxMokiniu = reader.nextInt();
		int totalMokiniu = reader.nextInt();
		Mokinys[] mokiniuMasyvas = new Mokinys[totalMokiniu];
		

		for (int i =0; i<mokiniuMasyvas.length; i++) {
			mokiniuMasyvas[i] = new Mokinys();
			mokiniuMasyvas[i].vardasPavarde = reader.next();
			mokiniuMasyvas[i].prioritetas = reader.nextInt();
		}	
	
		//Prideda nauja mokini
		//mokiniuMasyvas = Utils.addNewMokinys(mokiniuMasyvas, "A_Kostas", 1);		
		
		//Pasalina mokini
		//mokiniuMasyvas = Utils.removeMokinys(mokiniuMasyvas, 2);
				
		
		Utils.sortData(mokiniuMasyvas);
		Mokinys[] atrinktiMokiniai = Utils.trimData(mokiniuMasyvas, maxMokiniu);		
				
		Utils.printResult(atrinktiMokiniai);
		String fileWrite = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Rezultatai_programuotoju_klase.txt";
		Utils.writeToFile(atrinktiMokiniai, fileWrite);
		
		reader.close();
	}

}
