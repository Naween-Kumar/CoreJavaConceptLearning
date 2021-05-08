package BasicJava;

public class ArrayConcept{
	
	public static void main(String[] args) {
		
		// Array : To store similar data type values in one variable 
		// Error - java.lang.ArrayIndexOutOfBoundsException
		// Array disadvantage  
		//1. Size is fixed  >> To overcome this issue we use collections > Arraylist, hashtables > also called dynami array
		//2. Store only similar data types >> To overcome this issue we use "Object array"
		// This is called static array
		

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		for(int j=0; j<i.length;j++) {
			
			System.out.println(i[j]);
		}
		
		//Object array > <Object is a class>
		
		Object ob[] = new Object[5];
		ob[0] = "Naween";
		ob[1] = 25;
		ob[2] = 'M';
		ob[3] = 5.6;
		ob[4] = "Married";
		
		for(int k=0;k<ob.length;k++) {
			System.out.println(ob[k]);
		}

		System.out.println("**********************");
		
		int x[][] = new int[2][2];
		x[0][0] = 1;
		x[0][1] = 2;
		x[0][2] = 2;
		
		
		x[1][0] = 4;
		x[1][1] = 5;
		
		
		
		
		
		for(int n=0;n<x.length;n++) {
			for(int m=0;m<x.length;m++) {
				
				System.out.println(x[n][m]);
				
			}
			
		}
		
		

	
		
	}
}
