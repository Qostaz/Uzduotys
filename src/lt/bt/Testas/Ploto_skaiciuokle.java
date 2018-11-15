package lt.bt.Testas;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Ploto_skaiciuokle {

	public static void main(String[] args) throws IOException{
		Scanner reader = new Scanner(System.in);
		boolean stop = false;		
		while (!stop) {			
			System.out.println("Trikampis - 1");
			System.out.println("Staciakampis - 2");
			System.out.println("Skritulys - 3");
			System.out.println("Pasirinkite, kurios figuros plota norite skaiciuoti (nurodykite skaiciu):");
			int number = reader.nextInt();
			
			if (number == 1) {
				System.out.println("Nurodykite trikampio krastine:");
				int krastine = reader.nextInt();
				System.out.println("Nurodykite trikampio aukstine:");
				int aukstine = reader.nextInt();
				int trikampioPlotas = (krastine * aukstine) /2;
				System.out.println("Trikampio plotas: " + trikampioPlotas);
			} else if (number == 2) {
				System.out.println("Nurodykite staciakampio ilgi:");
				int ilgis = reader.nextInt();
				System.out.println("Nurodykite staciakampio ploti:");
				int plotis = reader.nextInt();
				int staciakampioPlotas = ilgis * plotis;
				System.out.println("StaciakampioPlotas: " + staciakampioPlotas);			
			} else if (number == 3) {
				System.out.println("Nurodykite skirtulio spinduli:");
				int spindulys = reader.nextInt();
				double skritulioPlotas = Math.pow(spindulys, 2)*Math.PI;
				System.out.println("StaciakampioPlotas: " + skritulioPlotas);				
			} else {
				System.out.println("Nurodytas neteisingas skaicius");
			}
			
		    System.out.println("Ar norite skaiciuoti kitos figuros plota? (taip arba ne)");
		    BufferedReader atsakymas = new BufferedReader(new InputStreamReader(System.in)) ;
		    
		    if(atsakymas.readLine().equals("ne")) {
		        stop = true;
		    }
		}
		reader.close();
	}
}
