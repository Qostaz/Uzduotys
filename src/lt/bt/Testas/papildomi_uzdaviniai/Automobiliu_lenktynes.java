package lt.bt.Testas.papildomi_uzdaviniai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Automobiliu_lenktynes {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Duomenys_automobiliu_lenktynes.txt";
		File file = new File(filePath);
		Scanner reader = new Scanner(new FileReader(file));
		
		int lines = 0;
		while (reader.hasNext()) {
			lines++;
			reader.nextLine();
		}
		
		reader = new Scanner(new FileReader(file));
		String[][] stringArray = new String[lines][];
				
		for (int i = 0; i<lines; i++) {
			if (reader.hasNext()) {
				String line = reader.nextLine();
				stringArray[i] = line.split(" ", 3);							
			}
		}
		
		double[][] result = new double[lines-1][2];
		
		for(int i = 0; i<lines-1; i++) {
			String[] data = stringArray[i+1][2].split(" ");
			int rowSum = 0;
			for (int j = 0; j<data.length; j++) {
				rowSum += Integer.parseInt(data[j]);
			}			
			double usedFuelMean = (double) rowSum/Double.parseDouble(stringArray[i+1][1]);
			//print(String.valueOf(usedFuelMean));
			result[i][0] = Double.parseDouble(stringArray[i+1][0]);
			result[i][1] = usedFuelMean;			
		}		
		
		for(int i = 0; i<result.length; i++) {
			for(int o =i+1; o<result.length; o++) {
				double vairuotojas1 = result[i][0];
				double vairuotojas2 = result[o][0];
				double skaicius1 = result[i][1];
				double skaicius2 = result[o][1];
				if (skaicius1 > skaicius2) {
					result[i][0] = vairuotojas2;
					result[o][0] = vairuotojas1;
					result[i][1] = skaicius2;		
					result[o][1] = skaicius1;				
				} 
			}
		}
		
		print("Rezultatas: maziausiai degalu (" + result[0][1] +") sunaudojo vairuotojas " + result[0][0]);
		reader.close();
	}
	


	private static void print(String text) {
		System.out.println(text);
	}
}
