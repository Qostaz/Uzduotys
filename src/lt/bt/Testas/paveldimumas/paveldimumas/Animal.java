package lt.bt.Testas.paveldimumas.paveldimumas;

public class Animal {
	protected String sound;
	
	public Animal(String sound) {
		this.sound = sound;
	}	
	
	public void print(){
		
		System.out.println("no sound");
	}	
	
	public String toString(){
		return "no sound";
	}
}