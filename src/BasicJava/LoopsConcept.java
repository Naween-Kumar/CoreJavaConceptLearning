package BasicJava;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Disadvantage of while loop -->> If we dont increament the values, it generate infinate loop.
		
		int i = 1; // Initialisation 
		while(i<10) {  //Condition
			System.out.println("While loop"+i);
			i++;		//Increment/Decreament
		}
		
		//For loop
		
		for(i=0;i<10;i++) {
			
			System.out.println("for loop"+i);
			
		}
	}
}
