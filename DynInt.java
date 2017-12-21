// Demonstrate dynamic intitalisation.
class DynInt {
	public static void main(String[] args) {
		double a = 3.0, b = 4.0;

		// c will be dynamically initalised, its value is not determined until runtime
		double c = Math.sqrt(a * a + b * b);

		System.out.print("The hypontenuse is: " + c);
	}
}