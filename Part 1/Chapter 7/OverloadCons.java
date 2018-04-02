class Box {
	double width;
	double height;
	double depth;

	// This is the contrcutor for Box.
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	/* Here, box defines three different constructors to
	initalize the box in various ways
*/
	Box() {
		width = -1 ;
		height = -1;
		depth = -1; // -1 ~ uninitalized
	}

	// Constructor used when cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width*height*depth;
	}
}

class OverloadCons {
	public static void main(String[] args) {
		// Create boxes using the different constructors
		Box mybox1 = new Box(10, 15, 20);
		Box mybox2 = new Box();
		Box mybox3 = new Box(7);

		double vol;

		// Get the volume of the first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is: " + vol);

		// Get the volume of the second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is: " + vol);

		// Get the volume of the first box
		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is: " + vol);

	}
}