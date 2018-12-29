package demo;

public class Calculator {
	
	public Calculator() {
	// Today is Friday//	
	}

	public int add(int a, int b) { // a and b are called as Formal Parameters
		return(a+b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		 // 10 and 20 are called as Actual Parameters
		
		System.out.println(basicCal.add(10, 20));
		basicCal.subtract(100, 20);
		basicCal.multiply(16, 4);
		basicCal.divide(1000, 20);

	}

}
