// This program includes a method inside the Box class

class Box {
	double width;
	double height;
	double depth;

	// display the volume of the box
	void volume() {
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
	}
}

class BoxDemo3 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		// assign values to mybox1's instance variables
		mybox1.width = 2;
		mybox1.height = 4;
		mybox1.depth = 8;

		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;

		// display the volumes of the boxes	
		mybox1.volume();	
		mybox2.volume();	
	}
}
