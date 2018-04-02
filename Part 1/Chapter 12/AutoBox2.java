class AutoBox2 {

    static int m(Integer v) {
        return v; // autounbox to int
    }

    public static void main(String[] args) {
        Integer iOb = m(100);

        System.out.println(iOb);
    }
}