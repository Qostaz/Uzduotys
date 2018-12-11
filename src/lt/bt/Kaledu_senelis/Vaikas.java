package lt.bt.Kaledu_senelis;

public class Vaikas {
	private String vardas;
	private String pavarde;
	private int amzius;
	private String adresas;
	private String kaleduNoras;
	private String charakteristika;
	
	public Vaikas(String vardas, String pavarde, int amzius, String adresas, String kaleduNoras) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.amzius = amzius;
		this.adresas = adresas;
		this.kaleduNoras = kaleduNoras;
	}

	public String getVardas() {
		return vardas;
	}
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	public String getPavarde() {
		return pavarde;
	}
	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	public String getAdresas() {
		return adresas;
	}
	public void setAdresas(String adresas) {
		this.adresas = adresas;
	}
	public String getKaleduNoras() {
		return kaleduNoras;
	}
	public void setKaleduNoras(String kaleduNoras) {
		this.kaleduNoras = kaleduNoras;
	}
	public int getAmzius() {
		return amzius;
	}
	public void setAmzius(int amzius) {
		this.amzius = amzius;
	}

	public String getCharakteristika() {
		return charakteristika;
	}

	public void setCharakteristika(String charakteristika) {
		this.charakteristika = charakteristika;
	}
	
	
}
