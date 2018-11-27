package lt.bt.Testas.paveldimumas2;

import lt.bt.Testas.paveldimumas.Animal;

public class Sheep  extends Animal {
	public Sheep(String sound) {
		super(sound);
		this.sound = sound;
	}
	
	public String toString(){
		return sound + " " + sound;
	}
}
