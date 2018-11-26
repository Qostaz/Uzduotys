package lt.bt.Testas.papildomi_uzdaviniai;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class S7_2_LEGO_robotas {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Duomenys_LEGO_robotas.txt";
		File file = null;
		Scanner reader = null;
		boolean fileExists = false;
		while (!fileExists) {
			try {
				fileExists = true;
				file = new File(filePath);
				reader = new Scanner(new FileReader(file));
			} catch (FileNotFoundException e) {
				fileExists = false;
				print("Iveskite kelia iki failo:");
				String newFilePath = enterForFilePath();
				filePath = newFilePath;			
			}
		}
		
		int lines = 0;
		while (reader.hasNext()) {
			lines++;
			reader.nextLine();
		}
		
		try {
			file = new File(filePath);
			reader = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {	
		}		
		double[][] savingsArray = new double[lines-1][];
		
		for(int i = 0; i<lines-1; i++) {
			double times = reader.nextDouble();
			double[] array = new double[(int)times];
			for(int j =0; j<times; j++) {
				array[j] = reader.nextDouble();
			}
			savingsArray[i] = array;			
		}
		
		double target = reader.nextDouble();
		
		double savingsSum = 0;
		for(int i = 0; i<savingsArray.length; i++) {
			double[] monthSavings = savingsArray[i];
			for(int j =0; j<monthSavings.length; j++) {
				savingsSum +=monthSavings[j];
			}
		}
		
		savingsSum = round(savingsSum, 2);
		
		String fileWrite = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Rezultatai_LEGO_robotas.txt";
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		print(String.valueOf(savingsSum));
		bw.write(String.valueOf(savingsSum));
		
		if (savingsSum > target) {
			print("Uzteks");
			bw.write("\r\nUzteks");
		} else {
			print("Neuzteks");
			bw.write("\r\nNeuzteks");
		}
		fw.close();
		bw.close();
		reader.close();
	}
	
	
	private static void print(String text) {
		System.out.println(text);
	}
	
	
	private static String enterForFilePath() {
		Scanner scan = new Scanner(System.in);
		String newFilePath = scan.next();
		return newFilePath;		
	}
	
    public static double round(double val, int places){
        if(places < 0) throw new IllegalArgumentException();
        
        BigDecimal bigDecimal = new BigDecimal(val);
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

}
