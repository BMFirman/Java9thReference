// use concatenation to prevent long lines
class ConCat {
    public static void main(String[] args) {
        String longStr = "This could have been " +
        "a very long line that would have been " +
        "wrapped around. But String concatenation " +
        "prevents this.";

        System.out.println(longStr);
    }
}