package OOPSPart1;

public class LocalVsGlobalVeriables {
	
	//  These are called globel variables and also these are non static in nature
	
	public static String name = "Naween"; // Can be accessed anywhere within the program
	public static int age = 500;

	public static void main(String[] args) {
		
		int i = 10;  //local variable, scope is limited to within main method
		System.out.println(i); 
		LocalVsGlobalVeriables obj = new LocalVsGlobalVeriables();
		
		System.out.println(age);
		System.out.println(name);
		
		obj.sum();
	

	}
	
	
	public void sum() {
		int i =25;  //local variable, scope is limited to within sum method
		age = 250;
		System.out.println(i+age);
	}

}
