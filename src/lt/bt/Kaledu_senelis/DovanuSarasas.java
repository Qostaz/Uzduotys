package lt.bt.Kaledu_senelis;

public class DovanuSarasas {
	private String vardas;
	private String pavarde;
	private String adresas;
	private String dovana;
	
	public DovanuSarasas(String vardas, String pavarde, String adresas, String dovana) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.adresas = adresas;
		this.dovana = dovana;
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
	public String getDovana() {
		return dovana;
	}
	public void setDovana(String dovana) {
		this.dovana = dovana;
	}
	
}
