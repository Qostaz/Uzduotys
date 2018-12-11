package lt.bt.Kaledu_senelis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lt.bt.Kaledu_senelis.Charakteristika;

public class Test {
	
	public static void main(String[] args) {
		List<Zaislas> zaisluSandelys = new ArrayList<Zaislas>();
		int indexAnglis =0;
		Scanner reader = Utils.startScanner("C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kaledos\\Elfu_sandelis.txt");
		reader.nextLine();
		int count=0;
		while(reader.hasNext()) {
			String[] tempArray = reader.nextLine().split(",");
			zaisluSandelys.add(new Zaislas(tempArray[0].trim(), Integer.parseInt(tempArray[1].trim())));
			if (tempArray[0].trim().equals("Anglių maišas")) {
				indexAnglis = zaisluSandelys.size()-1;
			}
			//ount++;
		}
		
		
		String t = zaisluSandelys.get(8).getZaisloPavadinimas();
		
		
		System.out.println(t.equals("Anglių maišas"));
		System.out.println(zaisluSandelys.get(8).getKiekis() ==100);
		System.out.println(indexAnglis);
		
	}

}
