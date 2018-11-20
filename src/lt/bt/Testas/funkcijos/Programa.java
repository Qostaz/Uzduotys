package lt.bt.Testas.funkcijos;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;



public class Programa {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		boolean stop = false;
		while (!stop) {
			print("Pasirinkite koki veiksma norite atlikti:");
			print("1 Apskaiciuoti masyvo vidurki.");
			print("2 Pasalinti masyvo reiksmes mazesnes arba didesnes uz masvyvo vidurki.");
			print("3 Neigoamus skaicius istrinti is masyvo ir perkelti i kita masyva.");
			print("4 Isrikiuokite masyvo reiksmes didejimo arba mazejimo reiksme.");
			int selection = reader.nextInt();
			switch (selection) {
				case 1:
					getArrayMean();  //  C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\arrays\\txt\\numbers.txt
					break;
				case 2:
					removeIntMoreOrLessThanMeanFromArray();  //  read C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\arrays\\txt\\numbers.txt
					break;									// write C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\arrays\\txt\\numbersMoreThanMean.txt
				case 3:
					removeNegativeIntFromArray();  		
					break;
				case 4:
					arrayMinMax();  		
					break;	 
				default:
					break;
			}
			print("Ar norite atlikti kita veiksma? (true/false)");
			boolean selectIfToContinue = reader.nextBoolean();
			if (!selectIfToContinue) {
				stop = true;
			}
		}
		reader.close();
	}
	

	private static void getArrayMean() throws IOException {		
		print("Nurodykite kelia iki masyvo:");
		String fileRead = reader.next();
		int numbersInFile = getIntNumberFromFile(fileRead);
		int[] skaiciai = getIntArrayFromFile(fileRead, numbersInFile);		
		int suma = getSumOfArrayValues(skaiciai);
		double vidurkis = (double)suma/(double)skaiciai.length;
		vidurkis =Double.parseDouble(new DecimalFormat("##.##").format(vidurkis));		
		System.out.println("Masyvo suma yra "+ suma + ", masyvo ilgis " + skaiciai.length + ", masyve esanciu skaiciu vidurkis yra " + vidurkis + "\n");
	}
	
	
	private static void removeIntMoreOrLessThanMeanFromArray() throws IOException {		
		print("Nurodykite kelia iki masyvo:");
		String fileRead = reader.next();
		int numbersInFile = getIntNumberFromFile(fileRead);
		int[] skaiciai = getIntArrayFromFile(fileRead, numbersInFile);		
		int suma = getSumOfArrayValues(skaiciai);
		double vidurkis = (double)suma/(double)skaiciai.length;		
		print("Nurodykite palikti didesnes (true) ar mazesnes (false) reiksmes uz vidurki");
		boolean selectMoreOrLess = reader.nextBoolean();		
		int trimmedArrayLength = getArrayLengthMoreOrLess(skaiciai, selectMoreOrLess, vidurkis);		
		int[] lessOrMoreMeanArray = getArrayMoreOrLess(skaiciai, selectMoreOrLess, trimmedArrayLength, vidurkis);
		if (selectMoreOrLess) {
			print("Skaiciai is masyvo didesni uz vidurki:"); 
		} else {
			print("Skaiciai is masyvo mazesni uz vidurki:"); 
		}
		print(printArrayAsString(lessOrMoreMeanArray)  + "\n");  
		print("Ar norite irasyti masyva i faila? (true/false)");
		boolean selectIfWrite = reader.nextBoolean();
		if (selectIfWrite) {
			print("Nurodykite kelia iki failo");
			String writeFilePath = reader.next();
			writeArrayToFile(lessOrMoreMeanArray, writeFilePath);
			print("Duomenys irasyti");
		}		
	}	
	
	
	private static void removeNegativeIntFromArray() throws IOException {
		print("Nurodykite kelia iki masyvo:");
		String fileRead = reader.next();
		int numbersInFile = getIntNumberFromFile(fileRead);
		int[] skaiciai = getIntArrayFromFile(fileRead, numbersInFile);
		double zero = 0;
		boolean selectMoreOrLess = false;
		int negativeArrayLength = getArrayLengthMoreOrLess(skaiciai, selectMoreOrLess, zero);		
		int[] negativeArray = getArrayMoreOrLess(skaiciai, false, negativeArrayLength, zero);		
		int[] positiveArray = getArrayMoreOrLess(skaiciai, true, skaiciai.length - negativeArrayLength, zero);
		print("Neigiami skaiciai is masyvo:");
		print(printArrayAsString(negativeArray)  + "\n");
		print("Teigiami skaiciai is masyvo:");
		print(printArrayAsString(positiveArray)  + "\n");
		print("Ar norite irasyti masyvus i failus? (true/false)");
		boolean selectIfWrite = reader.nextBoolean();
		if (selectIfWrite) {
			print("Nurodykite kelia iki aplanko, kuriame turetu buti issaugoti masyvai:");
			String writeFilePath = reader.next();
			String negativePatch = writeFilePath + "\\numbers_negative.txt";
			String positivePatch = writeFilePath + "\\numbers_positive.txt";
			writeArrayToFile(negativeArray, negativePatch);
			writeArrayToFile(positiveArray, positivePatch);
			print("Duomenys irasyti");
		}
		
	}
	
	
	public static void arrayMinMax() throws IOException {
		print("Nurodykite kelia iki masyvo:");
		String fileRead = reader.next();
		int numbersInFile = getIntNumberFromFile(fileRead);
		int[] skaiciai = getIntArrayFromFile(fileRead, numbersInFile);
		print("Nurodykite didejimo (true) ar mazejimo (false) tvarka norite isrikiuoti pasirinkto masyvo reiksmes?");
		boolean selectMinOrMax = reader.nextBoolean();	
		orderArrayMinOrMax(skaiciai, selectMinOrMax);
		if (selectMinOrMax) {
			print("Masyvas isrikiuotas didejimo tvarka:");
			print(printArrayAsString(skaiciai)  + "\n");
		} else {
			print("Masyvas isrikiuotas mazejimo tvarka:"); 
			print(printArrayAsString(skaiciai)  + "\n");
		}
		print("Ar norite irasyti masyva i faila? (true/false)");
		boolean selectIfWrite = reader.nextBoolean();
		if (selectIfWrite) {
			print("Nurodykite kelia iki aplanko, kuriame turetu buti issaugotas masyvas:");
			String writeFilePath = reader.next();
			String patch = writeFilePath + "\\numbers_ordered.txt";
			writeArrayToFile(skaiciai, patch);
			print("Duomenys irasyti");
		}
		
		
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

	
	private static int getSumOfArrayValues(int[] array) throws IOException {
		int suma = 0;	
		for (int i =0; i<array.length; i++) {
			suma += array[i];
		}		
		return suma;
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
	
	
	private static int getArrayLengthMoreOrLess(int[] array, boolean lessOrMore, double number) throws IOException {
		int arrayLength = 0;
		
		for(int l = 0; l<array.length; l++) {
			if (lessOrMore) {
				if (array[l] > number) {
					arrayLength++;				
				}
			} else {
				if (array[l] < number) {
					arrayLength++;				
				}
			}
		}
		return arrayLength;
	}
	
	private static int[] getArrayMoreOrLess(int[] array, boolean lessOrMore, int trimmedArrayLength, double number) throws IOException {
		int[] lessOrMoreMeanArray = new int[trimmedArrayLength];
		int j = 0;
		for(int i = 0; i<array.length; i++) {
			if (lessOrMore) {
				if (array[i] > number) {
					lessOrMoreMeanArray[j] = array[i];		
					j++;				
				} 
			} else {
				if (array[i] < number) {
					lessOrMoreMeanArray[j] = array[i];		
					j++;				
				} 
			}
		}
		return lessOrMoreMeanArray;
	}
	
	private static void print(String text) throws IOException {
		System.out.println(text);
	}
	
	
	private static String printArrayAsString(int[] array) throws IOException {
		String intAsString = "";
		for(int i=0; i<array.length; i++) {
			intAsString += array[i];
			if (i !=array.length-1) {
				intAsString += ", ";
			}
		}
		return intAsString;
	}
	
	private static void writeArrayToFile (int[] array, String text) throws IOException{
		FileWriter fw = new FileWriter(text);
		BufferedWriter bw = new BufferedWriter(fw);		
		for(int i=0; i<array.length; i++) {
			bw.write(String.valueOf(array[i]) + "\r\n");
		}
		bw.close();
		fw.close();
	}
	
	private static void orderArrayMinOrMax(int[] array, boolean selectMinOrMax) throws IOException{
		for(int i = 0; i<array.length; i++) {
			for(int o =i+1; o<array.length; o++) {
				int skaicius1 = array[i];
				int skaicius2 = array[o];			
				if (selectMinOrMax) {
					if (skaicius1 > skaicius2) {
						array[o] = skaicius1;
						array[i] = skaicius2;
					}
				
				} else {
					if (skaicius1 < skaicius2) {
						array[o] = skaicius1;
						array[i] = skaicius2;
					}
				}
			}
		}
	}

}
