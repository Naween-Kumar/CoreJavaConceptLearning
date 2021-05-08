package BasicJava;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		
		//Famous interview question ---> Post Increment 
				int a = 2;
				int b = a++; 
				
				System.out.println(a);  //>>3
				System.out.println(b);  //>>2
				
				
				//Famous interview question ---> Pre Increment 
						int x = 2;
						int y = ++x; 
						
						System.out.println(x);  //>>3
						System.out.println(y);  //>>3

	}

}
