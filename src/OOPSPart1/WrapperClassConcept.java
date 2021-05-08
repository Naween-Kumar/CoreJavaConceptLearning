//Wrapper class is used to convert the variable value from one data type to another data type for example string to integer
/*
 * 1.Integer.parseInt() >> String to integer
 * 2.Boolean.parseBoolean(s) >> String to boolean
 * 3.Double.parseDouble(s) >> String to double 
 * 4. String.valueOf(b) >> Convert int, double, boolean to String
 */

package OOPSPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String s = "100";
		int i =Integer.parseInt(s);
		System.out.println(i+20); // 120
		System.out.println(s+20); // 10020
		
		
		
		
	}

}
