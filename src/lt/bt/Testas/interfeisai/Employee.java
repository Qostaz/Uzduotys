package lt.bt.Testas.interfeisai;

public class Employee implements Payment {
	private String fullName;
	private String bankAccount;
	private double amount;
	
	public Employee (String fullName, String bankAccount, double amount) {
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
		return "Darbuotojas: " + this.fullName;
	}
	@Override
	public String obtainAmount() {
		return "Pervedama suma: " + this.amount;
	}

}
