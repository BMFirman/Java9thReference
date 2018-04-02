// equals() vs ==
class EqualsNotEqualTo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        String s3 = s1;

        // the following tests for literal equality
        System.out.println(s1 + " equals " + s2 + " -> " +
                            s1.equals(s2));
        // the following tests for object equality
        System.out.println(s1 + " == " + s2 + " -> " +
                            (s1 == s2));
        System.out.println(s1 + " == " + s3 + " -> " +
                            (s1 == s3));
    }
}