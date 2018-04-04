class ValueOfTest {
    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'c' };
        String strRep = String.valueOf(chars, 0, 2);
        System.out.println(strRep);
    }
}