// A simple example of inheritance.

// Create the superclass.
class A {
	int i, j;

	void showij() {
		System.out.println("i and j:" + i + " " + j);
	}
} 

// Create the subclass by extending A.
class B extends A {
	int k;

	void showk() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i+j+k: " + (i+j+k));
	}
}

class SimplerInheritance {
	public static void main(String[] args) {
		A suberObj = new A();
		B subObj = new B();

		// The superclass may be used by itself.
		superObj.i = 10;
		superObj.j = 20;
		System.out.println("Contents of superObj: ");
		superObj.showij();
		System.out.println();

		/*
			The subclass has access to all public members
			of its superclass
		*/
		subObj.i = 7;
		subObj.j = 8;
		subObj.k = 9;
		System.out.println("Contents of subObj: ");
		subOb.showij();
		subOb.showk();
		System.ut.println();

		System.out.println("Sum of i, j, and k in subOb:");
		subOb.sum();
	}
}
