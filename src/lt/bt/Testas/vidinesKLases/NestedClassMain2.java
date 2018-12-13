package lt.bt.Testas.vidinesKLases;

import java.util.ArrayList;
import java.util.List;

public class NestedClassMain2 {

	public static void main(String[] args) {

		List <Employee> darbuotojai = new ArrayList<Employee>();
	
		
		darbuotojai.add(new Employee("Kostas", darbuotojai.get(0).new Address("Kaunas", "Pramonės pr. 33")));
		darbuotojai.add(new Employee("Petras", darbuotojai.get(1).new Address("Kaunas", "Kolpingo g. 3")));
		darbuotojai.add(new Employee("Vilija", darbuotojai.get(2).new Address("Vilnius", "Ateities g. 888")));
		darbuotojai.add(new Employee("Gintarė", darbuotojai.get(3).new Address("Marijampolė", "Granatu g. 55")));

		
		
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
