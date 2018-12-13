package lt.bt.Testas.vidinesKLases;

public class Employee {
	
	private String name;
	private Address address;
	
	
	public Employee() {
	}
	
	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	
	class Address{		
		public Address() {
		}
		
		public Address(String city, String address) {
			this.city = city;
			this.address = address;
		}
		
		private String city;
		private String address;
		 
		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}	
		 
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
		
}
