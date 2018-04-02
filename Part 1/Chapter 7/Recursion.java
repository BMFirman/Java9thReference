// A simple example of recusion
class Fractorial {
	// This is a recursive method
	int fact(int n) {
		int result;

		if(n==1) return 1;
		result = fact(n-1) * n;
		return result;
	}
}

class Recursion {
	public static void main(String[] args) {
		Fractorial f = new Fractorial();

		System.out.println("Fractorial of three is " + f.fact(3));
		System.out.println("Fractorial of four is " + f.fact(4));
		System.out.println("Fractorial of ten is " + f.fact(10));
	}
}