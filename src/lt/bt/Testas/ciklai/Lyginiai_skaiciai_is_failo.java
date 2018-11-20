package lt.bt.Testas.ciklai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lyginiai_skaiciai_is_failo {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		String fileRead = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\loops\\txt\\numbers.txt";
		File file = new File(fileRead);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String fileWrite = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\loops\\txt\\results_even_numbers.txt";
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String st;
		while ((st = br.readLine()) != null) {
			if(Integer.parseInt(st) % 2 == 0) {
			bw.write(String.valueOf(st) + " - lyginis\r\n");
			} else {
			bw.write(String.valueOf(st) + " - nelyginis\r\n");
			}
		}
		System.out.println("Write done");
		br.close();
		bw.close();
		fw.close();
	}

}
