package lt.bt.Testas;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {
		String fileRead = "C:\\Users\\kosta\\eclipse-workspace\\Uzduotys\\res\\arrays\\txt\\numbers.txt";
		File file = new File(fileRead);
		Scanner br = new Scanner(new FileReader(file));	

		int linesInFile = 0;
		while (br.hasNextInt()) {
			linesInFile++;
		}
		

		
		int[] array = new int[linesInFile];		
		int b =0;
;
			
		while ( br.hasNextInt()) {
			array[b]= br.nextInt();
			b++;
		}		
		br.close();
		
		System.out.println("File read");
		br.close();
		

		int suma = 0;
		int masyvIlgis = array.length;
		for (int i =0; i<array.length; i++) {
			suma += array[i];
		}
		
		double vidurkis = (double)suma/(double)masyvIlgis;
		vidurkis =Double.parseDouble(new DecimalFormat("##.##").format(vidurkis));
		
		System.out.println("Masyvo suma yra "+ suma + ", masyvo ilgis " + masyvIlgis + ", masyve esanciu skaiciu vidurkis yra " + vidurkis + "\n");

	}

}
