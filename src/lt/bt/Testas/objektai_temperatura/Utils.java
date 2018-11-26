package lt.bt.Testas.objektai_temperatura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

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
	
	public static void getTimes(Scanner reader, Matavimai matavimai) {
		//System.out.println(reader.nextInt());
		matavimai.setMonthInt(reader.nextInt());
		matavimai.setTempTimes(reader.nextInt());
	}
	
	public static void addData(Temperatura[] temperatura, Matavimai matavimai, Scanner reader) {
		for (int i = 0; i<temperatura.length; i++) {
			temperatura[i] = new Temperatura();
			temperatura[i].setTempArray(new double[matavimai.getTempTimes()]);
			temperatura[i].setMonthName(reader.next());
			for (int j = 0; j<matavimai.getTempTimes(); j++) {
				temperatura[i].getTempArray()[j]=reader.nextDouble();
			}
		}
	}
	
	public static void calculateMonthAverageTemp(Temperatura[] temperatura, Matavimai matavimai) {
		double allTempSum = 0;
		for (int i = 0; i<temperatura.length; i++) {
			double tempSum = 0;			
			for (int j = 0; j<matavimai.getTempTimes(); j++) {
				tempSum += temperatura[i].getTempArray()[j];				
			}
			double averageTemp = tempSum/matavimai.getTempTimes();
			temperatura[i].setTempAverage(round(averageTemp,2));
			allTempSum += tempSum;
		}
		double allAverage = allTempSum/(matavimai.getTempTimes()*matavimai.getMonthInt());
		matavimai.setAllAverage(round(allAverage,2));
	}
	
	public static void printTempData(Temperatura[] temperatura, Matavimai matavimai) {
		for (int i = 0; i<temperatura.length; i++) {
			System.out.println(temperatura[i].getMonthName() + " " + temperatura[i].getTempAverage());
		}		
		System.out.println("Bendras matavimu vidurkis: " + matavimai.getAllAverage() + "\r\n");		
	}
	
	public static void writeToFile(Temperatura[] temperatura, Matavimai matavimai) throws IOException {		
		String fileWrite = enterPath();
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i = 0; i<temperatura.length; i++) {
			bw.write(temperatura[i].getMonthName() + " " + temperatura[i].getTempAverage() + "\r\n");
		}		
		bw.write("Bendras matavimu vidurkis: " + matavimai.getAllAverage() + "\r\n");		
		bw.close();	
		fw.close();
		System.out.println("Write done");
	}
	
    public static double round(double val, int places){
        if(places < 0) throw new IllegalArgumentException();        
        BigDecimal bigDecimal = new BigDecimal(val);
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}
