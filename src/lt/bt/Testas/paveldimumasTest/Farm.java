package lt.bt.Testas.paveldimumasTest;

import lt.bt.Testas.paveldimumas2.Cat;
import lt.bt.Testas.paveldimumas2.Dog;
import lt.bt.Testas.paveldimumas2.Cow;
import lt.bt.Testas.paveldimumas2.Sheep;
import lt.bt.Testas.paveldimumas2.Chicken;
import lt.bt.Testas.paveldimumas.Animal;

public class Farm {

	public static void main(String[] args) {


		Animal[] animals = {new Cat("miau"), new Dog("au"), new Cow("mu"), new Sheep("bee"), new Chicken("kud kudak")};
		
		for(int i = 0; i<animals.length; i++) {
			System.out.print(animals[i].getClass().getSimpleName() + " - ");
			animals[i].print();
			
		}
		
		System.out.println("________________________\n");
		
		
		Animal[] animals2 = {new Cat("miau"), new Dog("au"), new Cow("mu"), new Sheep("bee"), new Chicken("kud kudak")};

		
		//int[] animalCount = new int[animals2.length];
		int catCount = 0;
		int dogCount = 0;
		int cowCount = 0;
		int sheepCount = 0;
		int chickenCount = 0;
		
		for(int i =0; i<animals2.length; i++) {			
			if(animals[i] instanceof Cat) {
				catCount++;
			} else if (animals[i] instanceof Dog) {
				dogCount++;
			} else if (animals[i] instanceof Cow) {
				cowCount++;
			} else if (animals[i] instanceof Sheep) {
				sheepCount++;
			} else if (animals[i] instanceof Chicken) {
				chickenCount++;
			}			
			System.out.println(animals[i].toString());
		}
		System.out.println("Cats: " + catCount + ". Dogs: " + dogCount +  ". Cows: " + cowCount + ". Sheep: " + sheepCount + ". Chicken: " + chickenCount + ".");
	}

}
