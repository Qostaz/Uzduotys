package lt.bt.Testas.paveldimumas.paveldimumas2;

import lt.bt.Testas.paveldimumas.paveldimumas.Animal;

public class Chicken extends Animal{
	public Chicken(String sound) {
		super(sound);
		this.sound = sound;
	}
	
	public String toString(){
		return sound + " " + sound;
	}
}
