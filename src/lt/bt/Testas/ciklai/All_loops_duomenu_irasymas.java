package lt.bt.Testas.ciklai;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class All_loops_duomenu_irasymas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\loops\\txt\\numbers.txt";
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		int number = 1;
		
		do {
			bw.write(String.valueOf(number) + "\r\n");
			number++;
		} while (number<33);
		
		while (number<66) {
			bw.write(String.valueOf(number) + "\r\n");
			number++;
		}
		
		for(;number<=100;number++) {
			bw.write(String.valueOf(number) + "\r\n");
		}
		System.out.println("Done");
		bw.close();
		fw.close();
	}

}
