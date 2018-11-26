package lt.bt.Testas.objektai_temperatura;

import java.io.IOException;
import java.util.Scanner;

public class OroTemperaturosMatavimai {

	public static void main(String[] args) throws IOException {
		
		String filePath = Utils.enterPath();  //C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\objektinis\\Duomenys.txt
		Scanner readFile = Utils.startScanner(filePath);		
		
		Matavimai matavimai1 = new Matavimai();		
		Utils.getTimes(readFile, matavimai1);
		
		Temperatura[] temperatura1 = new Temperatura[matavimai1.getMonthInt()];	
		Utils.addData(temperatura1, matavimai1, readFile);
		
		Utils.calculateMonthAverageTemp(temperatura1, matavimai1);		

		Utils.printTempData(temperatura1, matavimai1);

		Utils.writeToFile(temperatura1, matavimai1);    //C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\objektinis\\Rezultatai.txt
		
		readFile.close();
	}
}
