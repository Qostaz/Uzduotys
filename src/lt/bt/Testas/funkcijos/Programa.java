package lt.bt.Testas.funkcijos;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;



public class Programa {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		print("Pasirinkite koki veiksma norite atlikti:");
		reader = new Scanner(System.in);
		print("1 Apskaiciuoti masyvo vidurki.");
		int selection = reader.nextInt();
		switch (selection) {
			case 1:
				getArrayMean();  //  C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\arrays\\txt\\numbers.txt
				break;
			default:
				break;
		}
		
		
		

		reader.close();
		

	}

	
	private static void print(String text) throws IOException {
		System.out.println(text);
	}
	
	
	private static void getArrayMean() throws IOException {		
		print("Nurodykite kelia iki masyvo:");
		String fileRead = reader.next();
		int numbersInFile = getIntNumberFromFile(fileRead);
		int[] skaiciai = getIntArrayFromFile(fileRead, numbersInFile);		
		int suma = 0;
		int arrayLength = skaiciai.length;
		for (int i =0; i<skaiciai.length; i++) {
			suma += skaiciai[i];
		}
		double vidurkis = (double)suma/(double)arrayLength;
		vidurkis =Double.parseDouble(new DecimalFormat("##.##").format(vidurkis));		
		System.out.println("Masyvo suma yra "+ suma + ", masyvo ilgis " + arrayLength + ", masyve esanciu skaiciu vidurkis yra " + vidurkis + "\n");
	}
	
	
	private static int getIntNumberFromFile(String filePath) throws IOException {
		File file = new File(filePath);
		Scanner scan = new Scanner(new FileReader(file));
		int linesInFile = 0;
		while (scan.hasNextInt()) {
			scan.nextInt();
			linesInFile++;
		}		
		scan.close();		
		return linesInFile;
	}
	
	
	private static int[] getIntArrayFromFile(String filePath, int arrayLength) throws IOException {
		File file = new File(filePath);
		Scanner scan = new Scanner(new FileReader(file));
		int[] array = new int[arrayLength];		
		int b =0;
		while (scan.hasNextInt()) {
			array[b]= scan.nextInt();
			b++;
		}		
		scan.close();		
		return array;
	}

}
