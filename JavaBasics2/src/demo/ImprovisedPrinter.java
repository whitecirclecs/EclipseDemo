package demo;

public class ImprovisedPrinter {
	
	String name;
	int rollNumber;
	String school;
	
	public ImprovisedPrinter(String customerName, int rollNumber, String school) {
		name = customerName;
		this.rollNumber = rollNumber;
		this.school = school;
	}
	
	public void printDetails(ImprovisedPrinter obj) {
		System.out.println("Name of the customer = " + obj.name);
		System.out.println("Roll Number of the customer = " + obj.rollNumber);
		System.out.println("School of the customer = " + obj.school);
		
	}
	
	
	public static void main(String[] args) {
		ImprovisedPrinter obj1 = new ImprovisedPrinter("Deepinder",20,"White Circle Code School");
		
		obj1.printDetails(obj1);
	}
	
	
	
	

}
