// Use break and lables: to simulate goto
class Break {
	public static void main(String[] args) {
		boolean t = true;

		first: {
			second: {
				third: {
					System.out.println("Before the break.");
					// you can only break out into an enclosing block
					if(t) break second; // break out of the second block
					System.out.print("This won't execute");
				}
			System.out.println("This won't execute");
			}
		}
		System.out.println("This is after the second block");
	}
}