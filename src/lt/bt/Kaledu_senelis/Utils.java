package lt.bt.Kaledu_senelis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import lt.bt.Kaledu_senelis.Charakteristika;

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
	
	public static void printGiftList(List<DovanuSarasas> dovanuSarasas) {		
		System.out.println("Vardas, Pavardė, Adresas, Dovana" +"\r\n");
		for (int i = 0; i<dovanuSarasas.size(); i++) {
			System.out.println(dovanuSarasas.get(i).getVardas() + ", " + dovanuSarasas.get(i).getPavarde() + ", " + dovanuSarasas.get(i).getAdresas() + ", " + dovanuSarasas.get(i).getDovana() +"\r\n");
		}
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
	
	public static void printToys(List<Zaislas> zaislai) {
		System.out.println("Žaislas, Kiekis" +"\r\n");
		for (int i = 0; i<zaislai.size(); i++) {
			System.out.println(zaislai.get(i).getZaisloPavadinimas() + ", " + zaislai.get(i).getKiekis() +"\r\n");
		}			
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
	
	public static void readStorehouse(Scanner reader, List<Zaislas> zaisluSandelys, List<Zaislas> anglis) {
		reader.nextLine();
		while(reader.hasNext()) {
			String[] tempArray = reader.nextLine().split(",");
			if (!tempArray[0].trim().equals("Anglių maišas")) {
				zaisluSandelys.add(new Zaislas(tempArray[0].trim(), Integer.parseInt(tempArray[1].trim())));
			} else {
				anglis.add(new Zaislas(tempArray[0].trim(), Integer.parseInt(tempArray[1].trim())));
			}
		}
	}
	
	public static void readWishlist(Scanner reader, List<Vaikas> vaikuNorai) {
		reader.nextLine();
		while(reader.hasNext()) {
			String[] tempArray = reader.nextLine().split(",");
			if (Integer.parseInt(tempArray[2].trim())<16) {
				vaikuNorai.add(new Vaikas(tempArray[0].trim(), tempArray[1].trim(), Integer.parseInt(tempArray[2].trim()), tempArray[3].trim(), tempArray[4].trim()));
			}			
		}
	}
	
	public static void readCharacteristrics(Scanner reader, List<Vaikas> vaikuNorai) {
		reader.nextLine();
		while(reader.hasNext()) {
			String[] tempArray = reader.nextLine().split(",");
			for(int i  = 0; i<vaikuNorai.size(); i++) {
				String vaikasIsNoruSaraso = vaikuNorai.get(i).getVardas() + " " + vaikuNorai.get(i).getPavarde();
				String vaikasIsSenelioSaraso = tempArray[0].trim() + " " + tempArray[1].trim();
				if (vaikasIsNoruSaraso.equals(vaikasIsSenelioSaraso)) {
					if(tempArray[2].trim().equals("Blogas") || tempArray[2].trim().equals("Bloga")) {
						vaikuNorai.get(i).setCharakteristika(Charakteristika.BLOGAS.toString());
					} else if (tempArray[2].trim().equals("Geras") || tempArray[2].trim().equals("Gera")) {
						vaikuNorai.get(i).setCharakteristika(Charakteristika.GERAS.toString());
					}
				}					
			}				
		}
	}
	
	public static void fillGiftList(List<Vaikas> vaikuNorai, List<Zaislas> zaisluSandelys, List<Zaislas> uzsakymasElfams, List<Zaislas> anglis, List<DovanuSarasas> dovanuSarasas) {
		for(int i  = 0; i<vaikuNorai.size(); i++) {
			int count = 0;
			int count2 = 0;
			if (vaikuNorai.get(i).getCharakteristika().equals("GERAS")) {
				for(int j = 0; j<zaisluSandelys.size(); j++) {
					if(vaikuNorai.get(i).getKaleduNoras().equals(zaisluSandelys.get(j).getZaisloPavadinimas())) {
						if (zaisluSandelys.get(j).getKiekis()>0 ) {							
							zaisluSandelys.get(j).setKiekis(zaisluSandelys.get(j).getKiekis()-1);
						} else {
							uzsakymasElfams.add(new Zaislas(zaisluSandelys.get(j).getZaisloPavadinimas(), 1));
						}
						dovanuSarasas.add(new DovanuSarasas(vaikuNorai.get(i).getVardas(), vaikuNorai.get(i).getPavarde(), vaikuNorai.get(i).getAdresas(), vaikuNorai.get(i).getKaleduNoras()));
						count++;
					} else {
						count2++;
					}
				}
			} else if (vaikuNorai.get(i).getCharakteristika().equals("BLOGAS")) {
				if (anglis.get(0).getKiekis()>0 ) {
					anglis.get(0).setKiekis(anglis.get(0).getKiekis()-1);
				}else {					
					Utils.checkForIfExist(uzsakymasElfams, anglis.get(0).getZaisloPavadinimas());
				}
				dovanuSarasas.add(new DovanuSarasas(vaikuNorai.get(i).getVardas(), vaikuNorai.get(i).getPavarde(), vaikuNorai.get(i).getAdresas(),"Anglių maišas"));
				count++;
			}			
			if (count == 0) {
				dovanuSarasas.add(new DovanuSarasas(vaikuNorai.get(i).getVardas(), vaikuNorai.get(i).getPavarde(), vaikuNorai.get(i).getAdresas(), vaikuNorai.get(i).getKaleduNoras()));
			}
			if (count2 == zaisluSandelys.size()) {
				Utils.checkForIfExist(uzsakymasElfams, vaikuNorai.get(i).getKaleduNoras());				
			}
		}
	}

}
