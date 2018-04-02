// This program demonstrates the difference between
// public and private access modification

class Test {
	int a; // default access
	public int b; // public access
	private int c; // private access

	// methods to access c
	
	// set the value of c
	void setc(int i) {
		c = i;
	}

	// return the value of c
	int getc() {
		return c;
	}
}

class AccessTest {
	public static void main(String[] args) {
		Test ob = new Test();

		// These are OK, a nad b may be accessed directly
		ob.a = 10;
		ob.b = 20;

		// This is NOT OK and will cause an error
	//	ob.c = 100; // Error!

		// You must access c via it's methods
		ob.setc(10);
		System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " +
			ob.getc());
	}
}