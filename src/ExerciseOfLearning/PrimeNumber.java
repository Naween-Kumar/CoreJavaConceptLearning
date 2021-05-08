// If we have to call non static methods in a main function than we call by creating a object of the class 
// If we have to call  static methods in a main function than we call directly or by class name 

package ExerciseOfLearning;

import java.util.Scanner;

public class PrimeNumber {

	static int num;

	public static boolean isPrimenum(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number- ");
			num = sc.nextInt();
		}
		System.out.println("The given number  " + num + "  Is prime ?" + isPrimenum(num));

	}

}
