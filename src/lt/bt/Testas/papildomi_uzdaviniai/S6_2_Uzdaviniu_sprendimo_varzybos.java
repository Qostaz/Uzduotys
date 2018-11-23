package lt.bt.Testas.papildomi_uzdaviniai;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class S6_2_Uzdaviniu_sprendimo_varzybos {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Duomenys.txt";
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
				stringArray[i] = line.split(" ", 2);							
			}
		}		
		
		String fileWrite = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Rezultatai.txt";
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int[] result = new int[lines];
		int totalSum = 0;
		for(int i = 0; i<lines-1; i++) {
			String[] data = stringArray[i+1][1].split(" ");
			int rowSum = 0;
			for (int j = 0; j<data.length; j++) {
				rowSum += Integer.parseInt(data[j]);
			}
			result[i] = rowSum;
			totalSum+=rowSum;
			if(i == lines-2) {
				result[i+1] = totalSum;
			}
		}		
		
		for(int i = 0; i<result.length; i++) {
			bw.write(String.valueOf(result[i]));
			bw.newLine();			
		}
		
		print("Rezultatai irasyti i faila");		
		for (int i = 0; i<result.length; i++) {
			System.out.print(result[i]);
			if(i!=result.length-1) {
				System.out.print(", ");
			}
		}
		
		reader.close();
		bw.close();

	}
	
	
	private static void print(String text) {
		System.out.println(text);
	}

}
