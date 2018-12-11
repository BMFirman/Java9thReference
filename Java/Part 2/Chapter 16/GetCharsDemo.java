class GetCharsDemo {
    public static void main(String[] args) {
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char[] buf = new char[end - start];

    // getChars(int sourceStart, int sourceEnd, char[] target, int targetStart)
    // notes this also works with bytes
        s.getChars(start, end, buf, 0);
        System.out.println(buf);

        char c = s.charAt(1);
        System.out.println(c);

        char[] c2 = s.toCharArray();
        System.out.println(c2);

    }
}