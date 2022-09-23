package hasaispractic;

public class Address {
	String addLine,street,city,state,country;
	int pin;
	public Address() {
		addLine="Ward No 8";
		street="Adra Road";
		city="Purulia";
		state="West Bengal";
		country="India";
		pin=723133;
	}
	public Address(String addLine, String street, String city, String state, String country, int pin) {
		this.addLine = addLine;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	public void display()
	{
		System.out.println("Addreaa Line : "+addLine);
		System.out.println("Street : "+street);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);
		System.out.println("Pin Code : "+pin);
	}
}
