package lt.bt.Testas.paveldimumas.paveldimumas2;

import lt.bt.Testas.paveldimumas.paveldimumas.Animal;

public class Cow  extends Animal {
	public Cow(String sound) {
		super(sound);
		this.sound = sound;
	}
	
	public String toString(){
		return sound + " " + sound;
	}
}
