// Demonstrate block scope
class Scope {
	public static void main(String[] args) {
		int x;

		x = 10;
		if (x == 10) { // begin a new scope
			int y = 20; // y is known only to the block it is enclosed in
			
			System.out.println("x and y are :" + x + " " + y);
			x = y * 2; // this will flow to the outer scope changing x's value
		}
		// y = 100; this will result in an error as y is not defined in this scope

		// x is still defined in this scope
		System.out.println("x is " + x);
	}
}