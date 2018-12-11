// 8 bit byte string constructors
// String(byte chrs[])
// String(byte[] chrs, int startIndex, intNumChars)

// construct a string from the subset of the char array
class SubStringCons {
    public static void main(String[] args) {
        // A, B, C, D, E, F
        byte[] ascii = { 65, 66, 67, 68, 69, 70 };

        String s1 = new String(ascii);
        System.out.println(s1);

        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);

        char[] chars = { 'a', 'b', 'c' };
        String s3 = new String(chars);
        // recall that string length uses a ()
        System.out.println(s3.length());
    }
}