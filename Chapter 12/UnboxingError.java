class UnboxingError {
    public static void main(String[] args) {
        Integer iOb = 1000; // autobox the value 1000

        int i = iOb.byteValue(); // manually unbox as a byte

        System.out.println(i);
    }
}