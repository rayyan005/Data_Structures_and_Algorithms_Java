
public class Calculator {

	
	
	/**
	 * Calculating the result of the expression that is given in polish notation
	 * 
	 * @param cmds the array containing the expression in polish notation
	 * @return the final result as an integer
	 */
	public static int calculate(String[] cmds) {
		Stack pstack = new Stack(100);

		Reverse.reverse(cmds);

		// Iterating through the reversed list
		for (String e : cmds) {

			// If the element is a number, we push it into the stack
			if (isNumber(e)) {
				pstack.push(e);
			} else {
				// Pop 1st two elements and then use toString() to convert it into a String as pop returns an object
				String first = pstack.pop().toString();
				String second = pstack.pop().toString();

				// Then we apply the necessary operation and push it into the stack
				pstack.push(applyOp(first, e, second));
			}
		}

		// Converting to an integer and returning
		return convert(pstack.pop().toString());

	}

	
	/**
	 * Method for converting a String to integer so we can later perform our operations.
	 * 
	 * @param s the string that is to be converted
	 * @return the converted integer value of the string
	 * @throws NumberFormatException if the given string is not an integer
	 */
	public static int convert(String s) throws NumberFormatException {

		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("It is not a number.");
		}
	}

	
	/**
	 * Method to check if the string is a number
	 * 
	 * @param s the string that we will be checking
	 * @return true if the string is a number, false if its not
	 */
	public static boolean isNumber(String s) {

		// We try to convert string to integer by using Integer.parseInt()
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			// If NumberFormatException is thrown, we know its an operator.
			return false;
		}
	}

	
	/**
	 * apply the operator after converting the numbers
	 * 
	 * @param fst
	 * @param op
	 * @param snd
	 * @return the result of applying the operator op
	 */
	public static int applyOp(String fst, String op, String snd) {

		// Converting from string to integer and storing it in variables for calculation
		int fst_converted = convert(fst);
		int snd_converted = convert(snd);

		// Checking the operator and doing the appropriate operation
		if (op == "+") {
			return (fst_converted + snd_converted);
		} else {
			return (fst_converted - snd_converted);
		}
	}

}
