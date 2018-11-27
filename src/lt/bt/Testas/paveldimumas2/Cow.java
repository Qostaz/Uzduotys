package lt.bt.Testas.paveldimumas2;

import lt.bt.Testas.paveldimumas.Animal;

public class Cow  extends Animal {
	public Cow(String sound) {
		super(sound);
		this.sound = sound;
	}
	
	public String toString(){
		return sound + " " + sound;
	}
}
