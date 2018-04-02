// Demonstrate variable length arguments
class VarArgs {

	// vatest() uses vararg
	static void vaTest(int ... v) { // A vargs parameter must be last
		System.out.print("Number of args: " + v.length +
			" Contents: ");

		for(int x : v) {
			System.out.print(x + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		// Notice how vaTest cab be called with
		// a variable number of arguments
		vaTest(10);
		vaTest(420, 69, 21);
		vaTest();
	}
}