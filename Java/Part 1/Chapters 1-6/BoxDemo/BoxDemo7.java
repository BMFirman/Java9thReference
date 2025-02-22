/* Here, Box uses the parameterized constructor to
    initialize the dimenstions of a box.
*/
class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth =d;
    }
    
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        // declare, allocate, and initalize Box objects
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        // get volume of the first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of the second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}