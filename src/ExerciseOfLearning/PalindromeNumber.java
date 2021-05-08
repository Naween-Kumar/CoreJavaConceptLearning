package ExerciseOfLearning;

public class PalindromeNumber {

	public static boolean isPalindromnumber(int n) {
		int r, sum = 0,temp;
		temp = n;
		

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		
		if (sum == temp) {
			return true;
			
		}
		else {
			return false;
		}

	}

	public static void main(String[] args) {
		
		System.out.println(isPalindromnumber(151));

	}

}
