// Demonstrate the do-while loop
class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("tick " + n);
            n--;
        } while(n-- > 0);
        /*
        Alternatively the loop can be done this way
        do {
            System.out.println("tick " + n);
        } while(--n > 0);
        Put increment and decrement operators in more than for
        */
    }
}
