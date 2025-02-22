// override the toString() for the box class
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w; 
        height = h;
        depth = d;
    }

    public String toString() {
        return "Dimensions are "
            + width + " by "
            + height + " by "
            + depth;
    }
}

class ToStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Box b: " + b; // concatenate the Box object

        System.out.println(b); // convert Box to string
        System.out.println(s);
    }
}