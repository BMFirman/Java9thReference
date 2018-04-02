class MethNestTry {
   static void nesttry(int a) {
        try {
            // single cl arg
            if(a==1) {
                a = a / (a - a); // div-by-zero 
            }

            if(a==2) {
                int c[] = {1};
                c[99] = 42; // array-index-oob
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds " + e);
        }
    } 

    public static void main(String[] args) {
        try {
            int a = args.length;
            // no cl args
            int b = 42/a;
            System.out.println("a= " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero " + e);
        }
    }
}
    
