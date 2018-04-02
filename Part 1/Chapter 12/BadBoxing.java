class BadBoxing {
    public static void main(String[] args) {
        // you are far better off using primitives for speed
        Double a, b, c;

        a = 10.0;
        b = 4.0;
        c = Math.sqrt(a*a + b*b);
        System.out.println(c);
    }
}