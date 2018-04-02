/*
	Demonstrate a block of code.
	This file is called file BlockTest.java
*/
class BlockTest {
	public static void main(String[] args) {
		int x, y;

		y = 20;

		// the target of the loop is a block of code
		for (x = 0; x < 10; x++) {
			System.out.println("This is x: " + x);				
			System.out.println("This is y: " + y);
			y = y - 2;
		}
	}
}
