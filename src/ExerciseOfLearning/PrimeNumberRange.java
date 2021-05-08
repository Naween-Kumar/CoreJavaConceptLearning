package ExerciseOfLearning;

public class PrimeNumberRange {

	static int num = 5;

	public static boolean isPrimenumber(int num) {

		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;

	}

	public static void getPrimenumbers(int num) {
		for (int i = 2; i < num; i++) {
			if (isPrimenumber(i)) {
				System.out.println(i + "  Is a prime number");

			}
		}
	}

	public static void main(String[] args) {

		getPrimenumbers(21);

		System.out.println(isPrimenumber(num));

	}

}
