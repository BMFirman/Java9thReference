// Demonstrate the lifetime of a variable
class Lifetime {
	public static void main(String[] args) {

		for(int x = 0; x < 3; x++) {
			int y = -1; // y is going to be constantly redefined at every itteration of the loop
			System.out.println("y is " + y);	
			y = 100; // you won't be needing to add an int to the front here
			System.out.println("y is " + y); // and don't forget those semicolons
		}
	}
}