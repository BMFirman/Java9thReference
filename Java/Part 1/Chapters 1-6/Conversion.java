// Demostrate casting
class Conversion {
	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;

		System.out.println("Converting an int to a byte");
		b = (byte) i; // b now equals i converted into a byte
		System.out.println("i and b :" + b);
		// b's range = 256, 257/256 = 1 as a remainder
		
		System.out.println("Converting a double to an int");
		i = (int) d;
		System.out.println("i and d :" + i);
		// d has simply been truncated to fit i

		System.out.println("Converting a double to a byte");
		b = (byte) d;
		System.out.println("b and d :" + b);
		// firstly d is truncated then is subject to 323/256

	}
}