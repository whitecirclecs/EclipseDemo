package demo;

public class Printer {
	
	public void printName(String name) {
		System.out.println("Name of the customer = " + name);
	}
	
	public void printRollNumber(int number) {
		System.out.println("Roll Number of the customer  = " + number);
	}
	
	public void printSchool(String school) {
		System.out.println("Customer reads in " + school);
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.printName("Deepinder");
		printer.printRollNumber(20);
		printer.printSchool("White Circle Code School");
		
	}

}
