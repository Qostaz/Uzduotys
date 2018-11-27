package lt.bt.Testas.paveldimumas.paveldimumas2;

import lt.bt.Testas.paveldimumas.paveldimumas.Animal;

public class Sheep  extends Animal {
	public Sheep(String sound) {
		super(sound);
		this.sound = sound;
	}
	
	@Override
	public String toString(){
		return sound + " " + sound;
	}
}
