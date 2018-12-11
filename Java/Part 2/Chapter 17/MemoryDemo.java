// demonstrate totalMemory(), freeMemory(), and gc()

class MemoryDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Double[] someInts = new Double[100000000];
        for (double i = 0; i<someInts.length; i++) {
            someInts[(int)i] = i;
        }
        System.out.println("Total memeory is: "
                            + r.totalMemory());
        mem1 = r.freeMemory();
    }
}