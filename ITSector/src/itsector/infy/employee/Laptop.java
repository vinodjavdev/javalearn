package itsector.infy.employee;

public class Laptop {

	
	int id;
	
	String brand;
	
	String os;

	public Laptop(int id, String brand, String os) {//parameterized constructor
		super();
		this.id = id;
		this.brand = brand;
		this.os = os;
	}
	
	public static void main(String[] args) throws Exception {
		
	
		Laptop lapTop=new Laptop(1, "DELL", "WINDOWS");
		
		
		Laptop lapTop1=new Laptop(1, "HP", "LINUX");
		
		if(lapTop1.brand.equals("HP")) {
			
			throw new Exception("this is a hap laptop");
		}
		
		System.out.println(lapTop);
		
		
		System.out.println(lapTop1);
		
		
		
		
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", os=" + os + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
