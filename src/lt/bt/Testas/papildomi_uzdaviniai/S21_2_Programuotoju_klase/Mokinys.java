package lt.bt.Testas.papildomi_uzdaviniai.S21_2_Programuotoju_klase;

public class Mokinys implements Comparable<Mokinys> {	
	
	private String vardasPavarde;
	private int prioritetas;
	
	
	public String getVardasPavarde() {
		return vardasPavarde;
	}

	public void setVardasPavarde(String vardasPavarde) {
		this.vardasPavarde = vardasPavarde;
	}

	public int getPrioritetas() {
		return prioritetas;
	}

	public void setPrioritetas(int prioritetas) {
		this.prioritetas = prioritetas;
	}

	public Mokinys (String vardasPavarde, int prioritetas) {
		this.vardasPavarde = vardasPavarde;
		this.prioritetas = prioritetas;
	}
	
	@Override
	public int compareTo(Mokinys otherMokinys) {
		/*int comparePriority = otherMokinys.getPrioritetas();
		return this.prioritetas-comparePriority;*/
		//arba
		return this.prioritetas-otherMokinys.getPrioritetas();		
	}
	
	
	
	
	
}
