package lt.bt.Kaledu_senelis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lt.bt.Kaledu_senelis.Charakteristika;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		//C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Elfu_sandelis.txt
		//C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Vaiko_charakteristika.txt
		//C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Vaikų_norai.txt
		int indexAnglis =0;
		
		List<Zaislas> zaisluSandelys = new ArrayList<Zaislas>();
		Scanner reader = Utils.startScanner("C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Elfu_sandelis.txt");
		reader.nextLine();
		while(reader.hasNext()) {
			String[] tempArray = reader.nextLine().split(",");
			zaisluSandelys.add(new Zaislas(tempArray[0].trim(), Integer.parseInt(tempArray[1].trim())));
			if (tempArray[0].trim().equals("Anglių maišas")) {
				indexAnglis = zaisluSandelys.size()-1;
			}
		}
		System.out.println("ko taip");
		List<Vaikas> vaikuNorai = new ArrayList<Vaikas>();
		reader = Utils.startScanner("C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Vaikų_norai.txt");
		reader.nextLine();
		while(reader.hasNext()) {
			String[] tempArray = reader.nextLine().split(",");
			System.out.println(Integer.parseInt(tempArray[2].trim()));
			if (Integer.parseInt(tempArray[2].trim())<16) {
				vaikuNorai.add(new Vaikas(tempArray[0].trim(), tempArray[1].trim(), Integer.parseInt(tempArray[2].trim()), tempArray[3].trim(), tempArray[4].trim()));
			}			
		}
		
		reader = Utils.startScanner("C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Vaiko_charakteristika.txt");
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
			
		//List<Zaislas> zaislaiIsardymui = new ArrayList<Zaislas>();			
		List<DovanuSarasas> dovanuSarasas = new ArrayList<DovanuSarasas>();
		List<Zaislas> uzsakymasElfams = new ArrayList<Zaislas>();
		

		for(int i  = 0; i<vaikuNorai.size(); i++) {
			int count = 0;
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
					}
				}
			} else if (vaikuNorai.get(i).getCharakteristika().equals("BLOGAS")) {
				if (zaisluSandelys.get(indexAnglis).getKiekis()>0 ) {
					zaisluSandelys.get(indexAnglis).setKiekis(zaisluSandelys.get(indexAnglis).getKiekis()-1);
				}else {
					uzsakymasElfams.add(new Zaislas(zaisluSandelys.get(indexAnglis).getZaisloPavadinimas(), 1));
				}
				dovanuSarasas.add(new DovanuSarasas(vaikuNorai.get(i).getVardas(), vaikuNorai.get(i).getPavarde(), vaikuNorai.get(i).getAdresas(),zaisluSandelys.get(indexAnglis).getZaisloPavadinimas()));
				count++;
			}
			
			if (count == 0) {
				dovanuSarasas.add(new DovanuSarasas(vaikuNorai.get(i).getVardas(), vaikuNorai.get(i).getPavarde(), vaikuNorai.get(i).getAdresas(), vaikuNorai.get(i).getKaleduNoras()));
			}			
		}	

			
		
		Utils.writeToFile(dovanuSarasas);    //C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Dovanu_sarasas.txt


	}

}
