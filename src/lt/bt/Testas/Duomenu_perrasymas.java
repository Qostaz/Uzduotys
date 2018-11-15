package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Duomenu_perrasymas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileRead = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\loops\\txt\\numbers.txt";
		File file = new File(fileRead);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String fileWrite = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\loops\\txt\\numbersCopy.txt";
		FileWriter fw = new FileWriter(fileWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String st;
		while ((st = br.readLine()) != null) {
			bw.write(String.valueOf(st) + "\r\n");
		}
		System.out.println("Done");
		br.close();
		bw.close();
		fw.close();
		
	}

}
