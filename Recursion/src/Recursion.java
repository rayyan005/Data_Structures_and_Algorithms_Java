public class Recursion {

	/**
	 * Calculates the sum of all positive numbers till n
	 * 
	 * @param n
	 * @return the sum of all positive numbers from 1 to n
	 */
	public static int sum(int n) {
		// Base Case
		if (n == 1) {
			return 1;
		}

		// Recursive Case
		else {
			return n + sum(n - 1);
		}
	}

	/**
	 * Multiplying two integers m and n using addition operator "+" and recursion.
	 * 
	 * @param m
	 * @param n
	 * @return the product of the two integers m and n
	 */
	public static int multiply(int m, int n) {

		// Base Case
		if (n == 0) {
			return 0;
		}

		// If one of the integers is negative
		else if (n < 0) {
			return -multiply(m, -n);
		}

		// If both of the integers are negative
		else if (n < 0 && m < 0) {
			return -multiply(-m, -n);
		}

		// Multiply m and n using addition & recursion
		else {
			return m + multiply(m, n - 1);
		}
	}

	/**
	 * Compute fibonacci number
	 * 
	 * @param n
	 * @return the nth fibonacci number using recursion
	 */
	public static int Fibonacci(int n) {

		// Base Case
		if (n == 0) {
			return 0;
		}

		// Base Case
		else if (n == 1) {
			return 1;
		}

		// Recursive Case
		else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}

}