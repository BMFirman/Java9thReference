class ChangeCase {
    public static void main(String[] args) {
        String s = "This is a test";
        System.out.println("Original: \n" + s + "\n");

        String upper = s.toUpperCase();
        String lower = s.toLowerCase();

        System.out.println(upper);
        System.out.println(lower);
    }
}