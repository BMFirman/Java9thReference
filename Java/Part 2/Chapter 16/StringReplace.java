class StringReplace {
    public static void main(String[] args) {
        String org = "This is a test. This is too.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;

        do { // replace all matching substrings
            System.out.println(org);
            i = org.indexOf(search);
            if(i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        } while (i != -1);

        String s1 = "Hello".replace('l', 'w');
        String s2 = "Konnichiha".concat(s1);
        System.out.println(s1);
        System.out.println(s2);
    }
}