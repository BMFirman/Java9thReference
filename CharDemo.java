// Demonstrate the char data type
// It would be useful to note that all java programs are unicode
// Unicode strings are transformed if need be before compilation
// Unicode occupies 16 bits
class CharDemo {
	public static void main(String[] args) {
		char ch1, ch2;

		ch1 = 88; // code for ASCII X
		ch2 = 'Y'; // literal char Y

		System.out.print("ch1 and ch2: ");
		System.out.print(ch1 + " " + ch2);
	}
}