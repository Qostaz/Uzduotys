package lt.bt.Testas.Kontrolinis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class VariantasA {

	public static void main(String[] args) throws IOException {
		
		String filePath = enterPath();
		Scanner reader = startScanner(filePath);  //C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\Kontrolinis\\DuomenysA.txt
		
		int stations = getStations(reader);
		int[] stationDistance = new int[stations];
		addData(reader, stationDistance);
		
		int totalDistance = sumDistance(stationDistance);
		int shortestDistance = getShortestDIstance(stationDistance);
		int longestDistance = getLongestDIstance(stationDistance);
		
		printData(totalDistance, shortestDistance, longestDistance);		
		
		writeToFile(totalDistance, shortestDistance, longestDistance);
		
		reader.close();
	}
	
	
	public static Scanner startConsoleScanner()  {
		Scanner consoleScanner = new Scanner(System.in);
		return consoleScanner;
	}
	
	public static String enterPath() {		
		System.out.println("Prasome ivesti kelia iki failo:");
		String filePath = startConsoleScanner().next();
		//startConsoleScanner().close();
		return filePath;
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
	
	public static int getStations(Scanner reader) {
		int stations = reader.nextInt();		
		return stations;
	}
	
	public static void addData(Scanner reader, int[] array) {
		for (int i = 0; i<array.length; i++) {
			array[i] = reader.nextInt();
		}
	}
	
	public static int sumDistance(int[] array) {
		int totalDistance = 0;
		for (int i = 0; i<array.length; i++) {
			totalDistance += array[i];
		}
		return totalDistance;
	}
	
	public static int getShortestDIstance(int[] array) {		
		int[] temp = array;
		for (int i = 0; i<temp.length; i++) {
			for (int j = i+1; j<temp.length; j++) {
				int int1 = temp[i];
				int int2 = temp[j];
				if (int1>int2) {
					temp[i] = int2;
					temp[j] = int1;
				}
			}
		}		
		int shortestDistance = temp[0];
		return shortestDistance;
	}
	
	public static int getLongestDIstance(int[] array) {
		int[] temp = array;
		for (int i = 0; i<temp.length; i++) {
			for (int j = i+1; j<temp.length; j++) {
				int int1 = temp[i];
				int int2 = temp[j];
				if (int1<int2) {
					temp[i] = int2;
					temp[j] = int1;
				}
			}
		}		
		int longestDistance = temp[0];
		return longestDistance;
		
		
	}	
	
	public static void printData(int totalDistance, int shortestDistance, int longestDistance) {	
		System.out.println("Maršruto atstumas: " + totalDistance + " m\r\n");		
		System.out.println("Trumpiausias atstumas: " + shortestDistance + " m\r\n");	
		System.out.println("Ilgiausias atstumas: " + longestDistance + " m\r\n");	
	}
	
	
	public static void writeToFile(int totalDistance, int shortestDistance, int longestDistance) throws IOException {		
		System.out.println("Duomenu i faila irasymas.");
		String fileWrite = enterPath();
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("Maršruto atstumas: " + totalDistance + " m\r\n");		
		bw.write("Trumpiausias atstumas: " + shortestDistance + " m\r\n");	
		bw.write("Ilgiausias atstumas: " + longestDistance + " m\r\n");			
	
		bw.close();	
		fw.close();
		System.out.println("Write done");
	}
	
}
