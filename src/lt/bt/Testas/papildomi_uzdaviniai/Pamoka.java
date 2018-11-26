package lt.bt.Testas.papildomi_uzdaviniai;

import java.util.Scanner;

public class Pamoka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		
		System.out.println("Kiek pamoku yra pirmadieni, antradieni, treciadieni, ketvirtadieni, penktadieni?");
		String data = reader.nextLine();
		String[] dataArray = data.split(" ", 5);
		int pamokuSkaicius = 0;
		
		for (int i=0; i<dataArray.length; i++) {
			pamokuSkaicius+= Integer.parseInt(dataArray[i]);
		}
		
		int vienosPamokosTrukmeMin = 45;
		System.out.println("Pamoku skaicius: " + pamokuSkaicius);
		System.out.println("Tai sudaro minuciu: " + vienosPamokosTrukmeMin*pamokuSkaicius);
		
		reader.close();
	}

}
