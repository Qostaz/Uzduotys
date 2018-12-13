package lt.bt.Testas.vidinesKLases;

import java.util.ArrayList;
import java.util.List;


public class NestedClassMain3 {

	public static void main(String[] args) {

		List <Employee> darbuotojai = new ArrayList<Employee>();
		
		darbuotojai.add(new Employee("Kostas"));
		darbuotojai.add(new Employee("Petras"));
		darbuotojai.add(new Employee("Vilija"));
		darbuotojai.add(new Employee("Gintarė"));
		Employee emp = new Employee("Gintarė");
		emp.setAddress(emp.new Address("Kaunas", "Pramonės pr. 33"));
		darbuotojai.get(0).setAddress(darbuotojai.get(0).new Address("Kaunas", "Pramonės pr. 33"));
		darbuotojai.get(1).setAddress(darbuotojai.get(1).new Address("Kaunas", "Kolpingo g. 3"));
		darbuotojai.get(2).setAddress(darbuotojai.get(2).new Address("Vilnius", "Ateities g. 888"));
		darbuotojai.get(3).setAddress(darbuotojai.get(3).new Address("Marijampolė", "Granatu g. 55"));
		
		
		List <String> miestai = new ArrayList<String>();
		
		
		for (Employee d : darbuotojai) {
			if (miestai.isEmpty()) {
				miestai.add(d.getAddress().getCity());
			} else {
				int count =0;
				for(int i =0; i<miestai.size(); i++) {					
					if (miestai.get(i).equals(d.getAddress().getCity())) {
						count++;
					}					
				}
				if(count==0) {
					miestai.add(d.getAddress().getCity());
				}
			}
		}
		
		for (String m : miestai) {
			System.out.println(m);
		}	
	}
}
