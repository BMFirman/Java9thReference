// Combine VarArgs with standard arguments
class VarArgs2 {
	static void vaTest(String msg, int ... v) {

		System.out.print(msg + v.length + " Contents: ");
		
		for(int x : v) {
			System.out.print(x + " ");
		}

		System.out.print("\n");
	}

	public static void main(String[] args) {
		vaTest("One VarArg: ", 10);
		vaTest("Two VarArgs: ", 1, 2, 3);
		vaTest("No VarArgs: ");
	}
}