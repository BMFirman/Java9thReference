// demostrate auto(un)boxing

class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100; // autobox an int
        int i = iOb; // autoUnbox

        System.out.println(i + " " + iOb);
    }
}