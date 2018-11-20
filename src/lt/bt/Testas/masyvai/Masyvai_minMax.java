package lt.bt.Testas.masyvai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Masyvai_minMax {

	public static void main(String[] args) throws IOException {
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
		
		//mazejimo tvarka
		for(int i = 0; i<array.length; i++) {
			for(int o =i+1; o<array.length; o++) {
				int skaicius1 = array[i];
				int skaicius2 = array[o];			
				if (skaicius1 < skaicius2) {
					array[o] = skaicius1;
					array[i] = skaicius2;				
				} 
			}
		}
		
		String max = "";		
		for(int m = 0; m<array.length; m++) {
			max += array[m];
			if (m !=array.length-1) {
				max += ", ";
			}
		}
		
		
		System.out.println("Masyvas mazejimo tvarka:");
		System.out.println(max  + "\n");
		
		//didejimo tvarka
		for(int i = 0; i<array.length; i++) {
			for(int o =i+1; o<array.length; o++) {
				int skaicius1 = array[i];
				int skaicius2 = array[o];			
				if (skaicius1 > skaicius2) {
					array[o] = skaicius1;
					array[i] = skaicius2;				
				} 
			}
		}
		
		String min = "";		
		for(int m = 0; m<array.length; m++) {
			min += array[m];
			if (m !=array.length-1) {
				min += ", ";
			}
		}
		
		
		System.out.println("Masyvas didejimo tvarka:");
		System.out.println(min  + "\n");

	}

}
