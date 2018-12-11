package lt.bt.Kaledu_senelis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MainKaledos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		

		List <Zaislas> anglis = new ArrayList<Zaislas>();
		List<Zaislas> zaisluSandelys = new ArrayList<Zaislas>();
		Scanner reader = Utils.startScanner("C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Elfu_sandelis.txt");
		Utils.readStorehouse(reader, zaisluSandelys, anglis);
		
		List<Vaikas> vaikuNorai = new ArrayList<Vaikas>();
		reader = Utils.startScanner("C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Vaikų_norai.txt");
		Utils.readWishlist(reader, vaikuNorai);
		
		reader = Utils.startScanner("C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Vaiko_charakteristika.txt");
		Utils.readCharacteristrics(reader, vaikuNorai);
		
		List<DovanuSarasas> dovanuSarasas = new ArrayList<DovanuSarasas>();
		List<Zaislas> uzsakymasElfams = new ArrayList<Zaislas>();
		Utils.fillGiftList(vaikuNorai, zaisluSandelys, uzsakymasElfams, anglis, dovanuSarasas);
	
		System.out.println("Dovanų sąrašas");
		Utils.printGiftList(dovanuSarasas);
		Utils.writeToFile(dovanuSarasas);    //C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Dovanu_sarasas.txt
		
		System.out.println("Užsakymas elfams");
		Utils.printToys(uzsakymasElfams);
		Utils.writeToFileUzsakymas(uzsakymasElfams);    //C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Gamybos_sarasas.txt
		
		System.out.println("Žaislai, kuriuos reikia išrinkti");
		Utils.printToys(zaisluSandelys);
		Utils.writeToFileUzsakymas(zaisluSandelys);    //C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Zaislai_skirti_isardyti.txt	
		
		reader.close();

	}

}
