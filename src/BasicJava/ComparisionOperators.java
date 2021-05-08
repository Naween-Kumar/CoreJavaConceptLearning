package BasicJava;

public class ComparisionOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question : Find the highest number among three numbers given 
		
		
		int a = 100;
		int b = 500 ;
		int c = 150;
		
		if(a>b & a>c) {
			System.out.println("a is the gretest number :"+a);
		}
		
		else if(b>c) {
			System.out.println("Number b is the greatest number "+b);
			
		}
		
		else {
			System.out.println("number c is the gretest number"+c);
			
		}

	}

}
