package lt.bt.Testas.masyvai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Masyvai_pasalinamiMazSkaic {

	public static void main(String[] args) throws IOException{
		String fileRead = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\arrays\\txt\\numbers.txt";
		File file = new File(fileRead);
		BufferedReader br = new BufferedReader(new FileReader(file));	

		int linesInFile = 0;
		while (br.readLine() != null) {
			linesInFile++;
		}
		
		br.close();
		
		int[] array = new int[linesInFile];		
		int b =0;
		String st;
		BufferedReader br2 = new BufferedReader(new FileReader(file));	
		while ( (st = br2.readLine()) != null) {
			array[b]= Integer.parseInt(st);
			b++;
		}		
		br2.close();
		
		System.out.println("File read, done");
		br.close();
		
		int suma = 0;
		int masyvIlgis = array.length;
		for (int i =0; i<array.length; i++) {
			suma += array[i];
		}
		
		double vidurkis = (double)suma/(double)masyvIlgis;
		
		int dArrayLength = 0;
		for(int l = 0; l<array.length; l++) {
			if (array[l] > vidurkis) {
				dArrayLength++;				
			}			
		}		

		//arba naudoti ArrayList<Integer> didesniUzVidurki = new ArrayList<>();
		int[] didesniUzVidurki = new int[dArrayLength];
		int[] mazesniUzVidurki = new int[masyvIlgis - dArrayLength];
		int j = 0;
		int k = 0;
		for(int i = 0; i<array.length; i++) {
			if (array[i] > vidurkis) {
				didesniUzVidurki[j] = array[i];
				//didesniUzVidurki.add(array[i]);    prideti prie ArrayList
				j++;				
			} else {
				mazesniUzVidurki[k] = array[i];
				k++;
			}		
		}
		
		String skaiciaiDidesni = "";
		//String skaiciaiMazesni = "";		
		for(int m = 0; m<didesniUzVidurki.length; m++) {
			skaiciaiDidesni += didesniUzVidurki[m];
			if (m !=didesniUzVidurki.length-1) {
				skaiciaiDidesni += ", ";
			}
		}
		
		System.out.println("Skaiciai is masyvo didesni uz vidurki:");
		System.out.println(skaiciaiDidesni  + "\n");
		
		
		String fileWrite = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\arrays\\txt\\numbersMoreThanMean.txt";
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		for(int i=0; i<didesniUzVidurki.length; i++) {
			bw.write(String.valueOf(didesniUzVidurki[i]) + "\r\n");
		}
		System.out.println("File write, done");

		bw.close();
		fw.close();

	}

}
