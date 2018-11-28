package lt.bt.Testas.abstraktumas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df2 = new DecimalFormat(".##");
		Figura[] array = new Figura[3];
		array[0] = new Apskritimas();
		array[1] = new Kvadratas();
		array[2] = new Trikampis_lygiakrastis();
		
		int answer;
		System.out.println("Pasirinkite, ka norite atlikti?");
		System.out.println("1 - Skaiciuoti plota");
		System.out.println("2 - Skaiciuoti perimetra");
		System.out.println("3 - Apskaiciuoti apskritimo, kvadrato, lygiakrascio trikampio krastiniu/spindulio ilgius");
		answer = askForConfirmation();		
		switch (answer) {
			case 1:
				System.out.println("Pasirinkite, ka norite atlikti?");
				System.out.println("1 - Skaiciuoti apskritimo plota");
				System.out.println("2 - Skaiciuoti kvadrato plota");
				System.out.println("3 - Skaiciuoti lygiakrascio trikampio plota");				
				answer = askForConfirmation();					
				System.out.println("Nurodykite krastines/spindulio ilgi:");						
				switch (answer) {
					case 1:
						array[0].krastinesIlgis= askForConfirmation();
						System.out.println("Apskritimo plotas:");
						System.out.println(df2.format(array[0].calcArea()));
						break;
					case 2:
						array[1].krastinesIlgis= askForConfirmation();
						System.out.println("Kvadrato plotas:");
						System.out.println(df2.format(array[1].calcArea()));
						break;
					case 3:
						array[2].krastinesIlgis= askForConfirmation();
						System.out.println("Lygiakrascio trikampio plotas:");
						System.out.println(df2.format(array[2].calcArea()));
						break;						
					default:
						System.out.println("Pasirinktas ne is saraso skaicius");
						break;						
				}
				break;
			case 2:
				System.out.println("Pasirinkite, ka norite atlikti?");
				System.out.println("1 - Skaiciuoti apskritimo perimetra");
				System.out.println("2 - Skaiciuoti kvadrato perimetra");
				System.out.println("3 - Skaiciuoti lygiakrascio trikampio perimetra");				
				answer = askForConfirmation();					
				System.out.println("Nurodykite krastines/spindulio ilgi:");	
				switch (answer) {
					case 1:
						array[0].krastinesIlgis= askForConfirmation();
						System.out.println("Apskritimo perimetras:");
						System.out.println(df2.format(array[0].calcPerimeter()));
						break;
					case 2:
						array[1].krastinesIlgis= askForConfirmation();
						System.out.println("Kvadrato perimetras:");
						System.out.println(df2.format(array[1].calcPerimeter()));
						break;
					case 3:
						array[2].krastinesIlgis= askForConfirmation();
						System.out.println("Lygiakrascio trikampio perimetras:");
						System.out.println(df2.format(array[2].calcPerimeter()));
						break;						
					default:
						System.out.println("Pasirinktas ne is saraso skaicius");
						break;						
				}
				break;
			case 3:
				System.out.println("Pasirinkite, ka norite atlikti?");
				System.out.println("1 - Apskaiciuoti perimetra ilgi nurodant plota");
				System.out.println("2 - Apskaiciuoti plota ilgi nurodant perimetra");			
				answer = askForConfirmation();	
				switch (answer) {
					case 1:
						System.out.println("Nurodykite plota");						
						answer = askForConfirmation();	
						for (int i = 0; i<array.length; i++) {
							System.out.println(array[i].getClass().getSimpleName());
							System.out.println("Krastines/spindulio ilgis: " + df2.format(array[i].calcPerimeterFromArea(answer)) + "\n");
						}
						break;						
					case 2:
						System.out.println("Nurodykite perimetra");						
						answer = askForConfirmation();	
						for (int i = 0; i<array.length; i++) {
							System.out.println(array[i].getClass().getSimpleName());
							System.out.println("Krastines/spindulio ilgis: " + df2.format(array[i].calcPerimeterFromPerimeter(answer)) + "\n");
						}						
						break;	
					default:
						System.out.println("Pasirinktas ne is saraso skaicius");
						break;	
				}
				break;
			default:
				System.out.println("Pasirinktas ne is saraso skaicius");
				break;
		}
	}
	
	public static int askForConfirmation() {
		int answer = startConsoleScanner().nextInt();
		return answer;
	}
	
	public static Scanner startConsoleScanner()  {
		Scanner consoleScanner = new Scanner(System.in);
		return consoleScanner;
	}

}
