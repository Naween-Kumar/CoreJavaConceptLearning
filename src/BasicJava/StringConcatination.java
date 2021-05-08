package BasicJava;

public class StringConcatination {

	public static void main(String[] args) {
		
		//Key point > Execution starts from left to right always
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		//Please let us know the output of the following stateent
		System.out.println(a+b);  //>> 300
		System.out.println(x+y);  //>> HelloWorld
		System.out.println(a+b+x+y); //>> 300HelloWorld
		System.out.println(x+y+a+b); //>> HelloWorld100200
		System.out.println(a+x+b+y+a+b+a); //>> 100Hello200World100200100
		
		

	}

}
