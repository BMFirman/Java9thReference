class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            // if not cl args there will be a div-by-zero
            int b = 42 / a;

            System.out.println("a = " + a);

            try { // a nested try block
                // single cl arg will div-by-zero the following
                if(a==1) {
                    a = a/(a-a);
                }

                // two cl args will out-of-bounds the following
                if(a==2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero 0: " + e);
        }
    }
}