class PoorAssert {
    static int val = 3;

    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n = 0;

        for (int i = 0; i< 10; i++) {
            // this will not run with enabling assertions
            assert (n = getnum()) > 0; // this is not a good idea

            System.out.println("n is " + n);
        }
    }
}