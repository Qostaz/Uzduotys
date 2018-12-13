package lt.bt.Testas.vidinesKLases;


public class NestedClassMain {

	public static void main(String[] args) {


		Employee darbuotojai = new Employee();

		
		darbuotojai.setName("Kostas");
		darbuotojai.setAddress(darbuotojai.new Address("Kaunas", "Pramonės pr. 33"));
		
		
		

		System.out.println(darbuotojai.getAddress().getCity());
		

		
	}

}
