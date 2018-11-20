package lt.bt.Testas.kintamieji;
import java.util.Scanner;

public class Kvadratine_lygtis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kvadratines lygties formule");
		System.out.println("ax^2 + bx + c = 0");
		Scanner reader = new Scanner(System.in);
		System.out.println("Nurodykite koeficienta a:");
		int koeficientasA = reader.nextInt();
		System.out.println("Nurodykite koeficienta b:");		
		int koeficientasB = reader.nextInt();
		System.out.println("Nurodykite koeficienta c:");		
		int koeficientasC = reader.nextInt();
		reader.close();
		System.out.println("Kvadratines lygties sprendiniai:");
		double diskriminantas = Math.pow(koeficientasB, 2) - (4*koeficientasA*koeficientasC);
		if (diskriminantas < 0) {
			System.out.println("Diskriminantas mazesnis uz 0, todel lygtis realiu sprendiniu neturi");
		} else if (diskriminantas == 0) {
			double x = (-koeficientasB)/(2*koeficientasA);
			System.out.println("Sprendinys x:" + x);
		} else {
			double x1 = ((-koeficientasB)-Math.sqrt(diskriminantas))/(2*koeficientasA);
			System.out.println("Sprendinys x1:" + x1);
			double x2 = ((-koeficientasB)+Math.sqrt(diskriminantas))/(2*koeficientasA);
			System.out.println("Sprendinys x2:" + x2);
		}

	}
}
