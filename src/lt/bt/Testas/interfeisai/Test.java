package lt.bt.Testas.interfeisai;

import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Payment> list = new ArrayList<Payment>();
		list.add(new Client("Jonas Jonaitis", "LT01144455", 55.50));
		list.add(new Employee("Darius Mockus", "LT01124455", 999.99));		
		list.add(new Client("Petras Petraitis", "LT01146855", 100));		
		list.add(new Client("Dalia Dalyte", "LT01962455", 150));
		list.add(new Employee("Lukas Kuze", "LT01754455", 30));
		
		
		
		for (Payment c : list) {
			System.out.println("Mokejimo informacija: ");
			/*if (c instanceof Client) {
				Client a = (Client) c;				
				System.out.print(a.obtainAccountOwner() + "\n");
				System.out.print(a.obtainBankAccount() + "\n");
				System.out.print(a.obtainAmount() + "\n");
				System.out.print("_____________\n\n");
			} else if (c instanceof Employee) {
				Employee b = (Employee) c;
				System.out.print(b.obtainAccountOwner() + "\n");
				System.out.print(b.obtainBankAccount() + "\n");
				System.out.print(b.obtainAmount() + "\n");
				System.out.print("_____________\n\n");
			}*/
			System.out.print(c.obtainAccountOwner() + "\n");
			System.out.print(c.obtainBankAccount() + "\n");
			System.out.print(c.obtainAmount() + "\n");
			System.out.print("_____________\n\n");
			
		}
	}
}
