package lt.bt.Testas;

//import java.util.ArrayList;
//import java.util.List;
//import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;




public class Masyvai {

	public static void main(String[] args) throws IOException {
		//1 SKAICIUOJAMAS VIDURKIS
		
		String fileRead = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\arrays\\txt\\numbers.txt";
		File file = new File(fileRead);
		Scanner scanner = new Scanner(new FileReader(file));
		
		int linesInFile = 0;
		while (scanner.hasNextInt()) {
			linesInFile++;
		}
		
		int[] array = new int[linesInFile];		
		int b =0;
		while (scanner.hasNextInt()) {
			array[b++]=scanner.nextInt();
			//b++;
		}		
		System.out.println("File read");
		scanner.close();
		

		int suma = 0;
		int masyvIlgis = array.length;
		for (int i =0; i<array.length; i++) {
			suma += array[i];
		}
		
		double vidurkis = (double)suma/(double)masyvIlgis;
		vidurkis =Double.parseDouble(new DecimalFormat("##.##").format(vidurkis));
		
		System.out.println("Masyvo suma yra "+ suma + ", masyvo ilgis " + masyvIlgis + ", masyve esanciu skaiciu vidurkis yra " + vidurkis + "\n");
		

		
		//2 PASALINAMI SKAICIAI MAZESNI UZ VIDURKI
		
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
		
		
		//3 NEIGIAMI SKAICIAI PERKELIAMI I NAUJA MASYVA, IS SENOJO ISTRINAMI
		int nArrayLength = 0;
		for(int q = 0; q<array.length; q++) {
			if (array[q] < 0) {
				nArrayLength++;				
			}			
		}		

		int[] neigiamiSkaiciaiArray = new int[nArrayLength];
		int[] arrayBeNeigiamu = new int[masyvIlgis - nArrayLength];
		int w = 0;
		int e = 0;
		for(int i = 0; i<array.length; i++) {
			if (array[i] < 0) {
				neigiamiSkaiciaiArray[w] = array[i];
				w++;				
			} else {
				arrayBeNeigiamu[e] = array[i];
				e++;
			}	
		}
		
		String neigiamiSkaiciai = "";		
		for(int m = 0; m<neigiamiSkaiciaiArray.length; m++) {
			neigiamiSkaiciai += neigiamiSkaiciaiArray[m];
			if (m !=neigiamiSkaiciaiArray.length-1) {
				neigiamiSkaiciai += ", ";
			}
		}
		
		System.out.println("Neigiami skaiciai is masyvo:");
		System.out.println(neigiamiSkaiciai  + "\n");


		
		//4 SURIKIUOTI MAZEJIMO DIDEJIMO TVARKA MASYVUS
		
	
		/*for(int i = 0; i<array.length; i++) {
			for(int o =i+1; o<array.length; o++) {
				int skaicius1 = array[i];
				int skaicius2 = array[o];
				
				if (skaicius1 < skaicius2) {
					array[o] = skaicius1;
					array[i] = skaicius2;				
				} 
			}
		}*/
		
		for(int l = 0; l<array.length; l++) {
			System.out.println(array[l]);
		
		}
		
		
	}
}
