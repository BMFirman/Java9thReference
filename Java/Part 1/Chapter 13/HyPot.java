import static java.lang.Math.*;
import static java.lang.System.out;
class HyPot {
    // this will override the sqrt in math
    /*
    static double sqrt(double a) {
        return a / 2;
    }
    */
    public static void main(String[] args) {
        double side1, side2, hypot;
        side1 = 3.0;
        side2 = 4.0;
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        out.println("Hypotenuse is " + hypot);
    }
}