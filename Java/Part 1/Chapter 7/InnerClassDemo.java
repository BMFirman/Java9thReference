// Demonstrate an inner class.
class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	// This is an inner class, they can be defined in methods.
	class Inner {
		int y = 10; // There is no way for outer to access y.
		void display() {
			// An inner class is able to access all of the variables
			// of the outer class in which it is contained.
			System.out.println("Display: Outer_x = " + outer_x);
		}
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
}

/*
	An alternative look at the inner class demonstration

class Outer {
	int outer_x = 100;

	void test() {
		for(int i=0; i<10; i++) {
			class Inner {
				void display() {
					System.out.println("Display: Outer_x = " + outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
}

class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
}
*/