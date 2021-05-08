package OOPSPart1;

public class FunctionAndMethods {

	public static void main(String[] args) {
		
		FunctionAndMethods obj = new FunctionAndMethods();
		
		//One object will be created and copy of all non static methods will be given to this object, object cant keep static method
		
		obj.getData();
	    int z =obj.test();
	    System.out.println(z);
	    String S1 =obj.qa();
	    System.out.println(S1);
	    int div1 = obj.division(30, 10);
	    System.out.println(div1);
	    
		
		
	}	
	// 2 kinds of Methods 1. Static methods 2. Non static methods, All non static methods gets assigned to object veriable
	/*
	 * 1. No input and no output 
	 * 2. No input some output  
	 * with input and with output 
	 */

	
	public void getData() {
		System.out.println("This is no input and no output method");
	}
	
	public int test() {
		System.out.println("This is a test method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	
	public String qa() {
		System.out.println("This is a qa method");
		String s = "Selenium class";
		
		return s;
	}
	
	public int division(int x, int y) {
		
		System.out.println("This is a division method");
		
		int div = x/y;
		return div;			
		
	}
}
