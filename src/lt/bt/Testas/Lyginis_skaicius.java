package lt.bt.Testas;
import java.util.Scanner;

public class Lyginis_skaicius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite sveika skaiciu:");
		String number = reader.nextLine();
	    
		boolean arSkaicius;
	    //check if int		
		try{
	        Integer.parseInt(number);
	        arSkaicius = true;
	    }catch(NumberFormatException e){
	        //not int
	    	arSkaicius = false;
	    }	

		if (!arSkaicius) {
			System.out.println("Ivestas ne sveikasis skaicius, bandykite is naujo");
			System.exit(0);
		}		

		System.out.println(number);
		if ((Integer.parseInt(number) % 2) == 0) {
			System.out.println("Ivestas skaicius " + number + " yra lyginis.");
		} else if ((Integer.parseInt(number) % 2) != 0) {
			System.out.println("Ivestas skaicius " + number + " yra nelyginis.");
		}
		reader.close();
	}

}
