// This program uses a parameterized method

class Box {
	double width;
	double height;
	double depth;

	// coputer and return volume
	double volume() {
		return width * height * depth;
	}

	// sets the dimenstions of the box
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}

class BoxDemo5 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		// initalize each box;
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);

		// get the volume of the first box
		vol = mybox1.volume();
		System.out.println("Volume of box1 " + vol);

		// get the volume of the first box
		vol = mybox2.volume();
		System.out.println("Volume of box2 " + vol);
	}
}