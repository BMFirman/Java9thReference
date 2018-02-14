class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            // int a = 1;
            
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = { 1 };
            c[42] = 99;
            // only the first exceptions will be caught as the rest
            // of the code in the try block is not executed
        } catch (ArithmeticException e ) {
            System.out.println("Diveded by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Out of bound array access: " + e);
        }
        System.out.println("After try/catch block");
    }
}