/*
	Demostrate the if.
	Call this file "IfSample.java"
*/
class IfSample {
	public static void main(String[] args) {
		// Initalize the variables x and y using a comma seperated list
		int x, y;

		// Set the values of x and y
		x = 10;
		y = 20;

		// First if statement
		if (x < y)
			System.out.println("x is less than y");

		// Multiply x by 2
		x = x * 2;

		// Second if statement
		if (x == y)
			System.out.println("x is equal to y");

		// Multiply x by 2
		x = x * 2;

		// Third if statement
		if (x > y)
			System.out.println("x is greater than y");
	}
}