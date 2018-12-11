package lt.bt.Kaledu_senelis;

public class Zaislas {
	private String zaisloPavadinimas;
	private int kiekis;
	
	public Zaislas (String zaisloPavadinimas, int kiekis) {
		this.zaisloPavadinimas = zaisloPavadinimas;
		this.kiekis = kiekis;
	}
	
	public String getZaisloPavadinimas() {
		return zaisloPavadinimas;
	}
	public void setZaisloPavadinimas(String zaisloPavadinimas) {
		this.zaisloPavadinimas = zaisloPavadinimas;
	}
	public int getKiekis() {
		return kiekis;
	}
	public void setKiekis(int kiekis) {
		this.kiekis = kiekis;
	}

}
