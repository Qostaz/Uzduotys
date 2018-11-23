package lt.bt.Testas.papildomi_uzdaviniai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Math;
import java.util.Scanner;

public class S7_1_Temperatura {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\papildomu_uzd\\Duomenys_temperatura.txt";
		File file = new File(filePath);
		Scanner reader = new Scanner(new FileReader(file));
		
		int lines = 0;
		while (reader.hasNext()) {
			lines++;
			reader.nextLine();
		}
		
		reader = new Scanner(new FileReader(file));
		double[] tempArray = new double[lines];
				
		for (int i = 0; i<lines; i++) {
			if (reader.hasNextDouble()) {
				tempArray[i] = reader.nextDouble();											
			}
		}
		
		double[] tempDifference = new double[lines-1];
		double maxDifference = 0;
		for (int i = 0; i<lines-1; i++) {
			double num1 = tempArray[i];
			double num2 = tempArray[i+1];
			double diff = num2-num1;		
			if (Math.abs(diff) > Math.abs(maxDifference) ){   
				maxDifference	=	diff;	
			}	
			tempDifference[i] = diff;
		}
		
		for (int i = 0; i<lines; i++) {
			print(String.valueOf(tempArray[i]));
			if (i<tempDifference.length) {
				if (tempDifference[i]>=0) {
					print("    (+" + String.valueOf(round(tempDifference[i], 1) + ")"));
				} else {
					print("    (" + String.valueOf(round(tempDifference[i], 1) + ")"));
				}
			}			
		}
		
		print("---------------");
		print("Dienu skaicius: " + lines);
		print("Didziausias temperaturos pokytis:  " + maxDifference);		
		reader.close();		
	}
	
	
	private static void print(String text) {
		System.out.println(text);
	}
	
    public static double round(double val, int places){
        if(places < 0) throw new IllegalArgumentException();
        
        BigDecimal bigDecimal = new BigDecimal(val);
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}
