class Elapsed {
    public static void main(String[] args) {
        long start, end;
        long x = 0;

        System.out.println("Timing for a loop from 0 to 100,000,000");

        // time a for loop from 0, to 100,000,000

        start = System.currentTimeMillis(); // get the starting time
        for (int i=0; i<100000000L; i++) {
            x++;
        }
        end = System.currentTimeMillis(); // get the ending time

        System.out.println("Elapsed time: " + (end-start));
    }
}