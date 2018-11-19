package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Masyvai_negiamiSkaicPerkel {

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
		
		System.out.println("File read");
		br.close();
		

		int masyvIlgis = array.length;
		
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
		
		String teigiamiSkaiciai = "";		
		for(int m = 0; m<arrayBeNeigiamu.length; m++) {
			teigiamiSkaiciai += arrayBeNeigiamu[m];
			if (m !=arrayBeNeigiamu.length-1) {
				teigiamiSkaiciai += ", ";
			}
		}
		
		
		System.out.println("Neigiami skaiciai is masyvo:");
		System.out.println(neigiamiSkaiciai  + "\n");
		
		System.out.println("Teigiami skaiciai like masyve:");
		System.out.println(teigiamiSkaiciai  + "\n");


		

	}

}
