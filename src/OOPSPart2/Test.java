/*
 * Inheritance concept
 * Method over-riding - Compile time polymorphism
 * Run time polimorphisam
 * 
 */


package OOPSPart2;

public class Test {

	public static void main(String[] args) {
		
		//Static polymorphism or compile time polymorphism // 
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("*********************************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		// Top casting/ Run time polymorphism or dynamic polymorphism >> Child class object reffered by parent class reference variable
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
	  // We can not see child class method 
		

	}

}
