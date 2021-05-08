package OOPSPart1;

public class StaticAndNonStatic {
	
//Global variable 	: Scope of global variable will be accross all program with some condition, static and non static 
	String name = "Static variable"; // Global non static method 
	static int age = 25; // Global Static method
	
	public static void main(String[] args) { 
		
/*How to call static method and variable ?
* 1. Direct calling
* 2. Calling by class name
*/		 
		
		//Direct calling : age and test() method
		
		System.out.println(age);
		test();
		
		//Calling by class name : age and test() method
		StaticAndNonStatic.test();
		System.out.println(StaticAndNonStatic.age);
		
//How to call non-static method and variable ?	
		
		//Ans - We have to call by object reference variable 
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		
	}

	
	public void sendMail() { //Non static method
		
		System.out.println("I am non static methd");
		
	}
	
	public static void test() { //Static method 
		
		System.out.println("I am  static methd");
		
	}
}
