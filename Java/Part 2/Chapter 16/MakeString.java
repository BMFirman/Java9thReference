class MakeString {
    public static void main(String[] args) {
        char[] c = { 'J', 'a', 'v', 'a' };
        String s1 = new String(c);
        String s2 = new String(s1);

        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };

        // String(char[] chars, startIndex, numChars);
        String s3 = new String(chars, 2, 3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}