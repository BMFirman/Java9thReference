// demonstrate the join() method defined by String
class StringJoinDemo {
    public static void main(String[] args) {
        
        // static String join(CharSequence delim, CharSequence...str)
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "ID#: 569",
                             "E-mail: John@HerbSchildt.com");
        System.out.println(result);
    }
}