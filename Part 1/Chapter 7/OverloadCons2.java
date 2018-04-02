// Here, Box allows one object to initalize another.

class Box {
	double width;
	double height;
	double depth;

	// Notice this constructor. It takes an object of type Box.
	Box(Box ob) { // Pass the object to the constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// Constructor used when all dimenstions are specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Constructor used when no dimenstions are specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// Constructor is used when the cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}
}

class OverloadCons2 {
	public static void main(String[] args) {
		// Create the boxes using each of the different constructors

		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();

		Box mycube = new Box(7);

		Box myclone = new Box(mybox1); // Create a copy of mybox1

		double vol;

		// get the volume of each box and print out that volume
		vol = mybox1.volume();
		System.out.println("The volume of mybox1 is: " + vol);

		vol = mybox2.volume();
		System.out.println("The volume of mybox2 is: " + vol);

		vol = mycube.volume();
		System.out.println("The volume of mycube is: " + vol);

		vol = myclone.volume();
		System.out.println("The volume of myclone is: " + vol);
	}
}