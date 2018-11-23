package lt.bt.Testas.papildomi_uzdaviniai;

import java.util.Scanner;

public class S6_1_Skaiciu_dalyba {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		print("Iveskite intervalo pradzia ir pabaiga (pvz.: 3;10)");
		String intervalas = reader.nextLine();		
		String[] array = intervalas.split(";");
		int[] numArray= new int[array.length];
		for(int i=0; i<array.length; i++) {
			numArray[i] = Integer.parseInt(array[i]);
		}
		
		int firstNum = numArray[0];
		int numInInterval = numArray[1]-numArray[0]+1;
		int[] fullInterval = new int[numInInterval];
		for (int i = 0; i<numInInterval; i++) {
			fullInterval[i] = firstNum;
			firstNum++;
		}
		
		int[] division = new int[numInInterval];
		
		for (int i = 0; i<fullInterval.length; i++) {
			int ppasidalino = 0;
			for(int j = 2; j<fullInterval[i]; j++) {
				if ((fullInterval[i] % j)==0) {
					ppasidalino++;
				}
			}
			division[i]=ppasidalino;
		}
		
		print("Skaicius | Dalijasi is:");
		for (int i = 0; i<fullInterval.length; i++) {
			print(String.valueOf(fullInterval[i]) + "          " +String.valueOf(division[i]));
		}
	}
	
	
	private static void print(String text) {
		System.out.println(text);
	}

}
