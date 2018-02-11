// This program uses inheritance to extend box.
class Box {
	double width;
	double height;
	double depth;

	// Construct a clone of an object
	Box(Box ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// Constructor used when no dimenstions are specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// Constructor used when a cube is createds
	Box(double len) {
		width = len;
		height =len;
		depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// Here the box class is extended to include weight.
class BoxWeight extends Box {
	double weight; // weight of box

	// Constructor for BoxWeight
	BoxWeight(double w, double h, double d, double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}

	double density(BoxWeight ob) {
		return ob.volume() / weight;
	}
}

class DemoBoxWeight {
	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight (10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight (2, 3, 4, 0.076);
		double vol;

		// You will need to do a printf if you can be bothered
		// To truncate the density.
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
    	System.out.print("Weight of mybox1 is " + mybox1.weight + "\n");
    	System.out.println("density of mybox1 is " + mybox1.density(mybox1) + "\n");

		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
    	System.out.print("Weight of mybox2 is " + mybox2.weight + "\n");
    	System.out.println("density of mybox2 is " + mybox2.density(mybox2) + "\n");
	}
}
