class AutoBox6 {
    public static void main(String[] args) {

        // autoboxing booleans
        Boolean b = true;

        // b will be unboxed when used in a conditional
        if(b) {
            System.out.println("b is true");
        }

        // autoboxing characters
        Character ch = 'x'; // box a char
        char ch2 = ch; // unbox a char

        System.out.println("ch2 is " + ch2);
    }
}