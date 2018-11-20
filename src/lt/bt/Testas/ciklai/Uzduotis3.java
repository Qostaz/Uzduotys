package lt.bt.Testas.ciklai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Uzduotis3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean stop = false;
		Scanner reader = new Scanner(System.in);		
		while (!stop) {
			int operacija = 0;
			boolean firstStep = false;
			while(!firstStep) {
				int[] reiksmes = {1,2,3,4};
				System.out.println("Koki veiskma norite atlikti?");
				System.out.println("Sudeti, spauskite 1");
				System.out.println("Atimti, spauskite 2");
				System.out.println("Dauginti, spauskite 3");
				System.out.println("Dalinti, spauskite 4");	
				operacija = reader.nextInt();
				for (int i=0; i<reiksmes.length; i++) {
					if(reiksmes[i] == operacija) {
						firstStep = true;
						break;
					}
				}
				if(!firstStep) {
					System.out.println("Ivestas netinkamas skaicius. Prasome ivesti skaiciu is saraso.");
				}
			}
				
			System.out.println("Iveskite pirmaji skaiciu:");			
			int skaicius1 = reader.nextInt();
			System.out.println("Iveskite antraji skaiciu:");	
			int skaicius2 = reader.nextInt();
			System.out.println("Rezultatas:");			
			switch(operacija) {
				case 1:
					System.out.println(skaicius1+skaicius2);
					break;
				case 2:
					System.out.println(skaicius1-skaicius2);
					break;
				case 3:
					System.out.println(skaicius1*skaicius2);
					break;
				case 4:
					System.out.println(skaicius1/skaicius2);
					break;	
				default:
					System.out.println("oops");
					break;				
			}
			System.out.println("Ar norite atlikti kita operacija? (taip arba ne)");
		    BufferedReader atsakymas = new BufferedReader(new InputStreamReader(System.in)) ;
		    if(atsakymas.readLine().equals("ne")) {
		        stop = true;
		        firstStep = false;
		    }
				
			}
			
			
		
		
		
		reader.close();

	}

}
