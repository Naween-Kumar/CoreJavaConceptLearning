// Constractor are methods which has same name as class name 
// Contractor are used to initialise the class veriables or class properties
// This keyword 

package OOPSPart1;

public class ConstructorConcept {
	
	int age;
	String name;
	
	
	
	public ConstructorConcept(int age, String name) {
		
		System.out.println("This is a constructor");
		
		this.age = age;
		this.name = name;

	}
 
	

	public static void main(String[] args) {
		
		
		ConstructorConcept obj = new ConstructorConcept(10,"Kamal");
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		

	}

}
