// this program catches Arithmetic and ArrayIndex exceptions
class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] vals = {1, 2, 3};
        try {
            // int result = a / b; // generate Arithmetic
            vals[10] = 19; // generate ArrayIndex
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e);
        }
        System.out.println("After multi-catch");
    }
}