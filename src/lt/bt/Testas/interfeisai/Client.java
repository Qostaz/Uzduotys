package lt.bt.Testas.interfeisai;



public class Client implements Payment{
	private String fullName;
	private String bankAccount;
	private double amount;
	
	public Client (String fullName, String bankAccount, double amount) {
		this.fullName = fullName;
		this.bankAccount = bankAccount;
		this.amount = amount;
	}
	@Override
	public String obtainBankAccount() {
		return "Banko saskaitos numeris: " + this.bankAccount;
	}
	@Override
	public String obtainAccountOwner() {
		return "Moketojas: " + this.fullName;
	}
	@Override
	public String obtainAmount() {
		return "Pervedama suma: " + this.amount;
	}
	
}
