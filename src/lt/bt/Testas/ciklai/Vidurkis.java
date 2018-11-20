package lt.bt.Testas.ciklai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Vidurkis {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileRead = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\loops\\txt\\numbers.txt";
		File file = new File(fileRead);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		int count = 0;
		int suma = 0;
		while ((st = br.readLine()) != null) {			
			suma += Integer.parseInt(String.valueOf(st));
			count++;
		}
		double vidurkis = Double.valueOf(suma)/Double.valueOf(count);
		System.out.println("Faile esanciu skaiciu suma yra: " + suma);
		System.out.println("Faile esanciu skaiciu yra: " + count);		
		System.out.println("Faile esanciu skaiciu vidurkis yra: " + vidurkis);
		
		String fileWrite = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\loops\\txt\\results_average.txt";
		BufferedReader tikrinimas = new BufferedReader(new FileReader(file));
		FileWriter fw = new FileWriter(fileWrite, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(String.valueOf(vidurkis + "\r\n"));
		System.out.println("Write done");
		
		br.close();
		tikrinimas.close();
		bw.close();
		fw.close();
	}

}
