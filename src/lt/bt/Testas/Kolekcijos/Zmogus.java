package lt.bt.Testas.Kolekcijos;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Zmogus {
	private String vardas;
	private String pavarde;
	private BigInteger asmensKodas;
	
	
	
	public Zmogus(String vardas, String pavarde, BigInteger asmensKodas) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.asmensKodas = asmensKodas;
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
	public BigInteger getAsmensKodas() {
		return asmensKodas;
	}
	public void setAsmensKodas(BigInteger asmensKodas) {
		this.asmensKodas = asmensKodas;
	}
	
}
