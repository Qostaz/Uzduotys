package lt.bt.Testas.paveldimumas2;

import lt.bt.Testas.paveldimumas.Animal;

public class Dog extends Animal {

	public Dog(String sound) {
		super(sound);
		this.sound = sound;
	}
	@Override
	public String toString(){
		return sound + " " + sound;
	}
}
