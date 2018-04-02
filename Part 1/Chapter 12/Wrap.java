// Demonstate a type wrapper
class Wrap {
    public static void main(String[] args) {

        Integer intObj = new Integer(100);

        // this unboxes intObj
        int i = intObj.intValue();

        System.out.println(i + " " + intObj); // displays 100 100
    }
}