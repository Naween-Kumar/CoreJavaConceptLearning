//Method overloading concept
/*
 * Method within the method is not allowed, means nested method is not allowed
 * Two method with same name, same number of argument, same data types are not allowed
 * 2 methods  with same name and different parameters are allowed and this is called as method overloading
 */

package OOPSPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(5);
		obj.sum(5.8);


		}
	
	public void sum() {
		System.out.println("Zero input parameter >>> 0");
	}
	
	
	public void sum(int a) {
		System.out.println("one input parameter >>> 1");
		System.out.println(a);
	}
	
	public void sum(double b) {
		System.out.println("one input parameter >>> 1");
		System.out.println(b);
	}
	

}
