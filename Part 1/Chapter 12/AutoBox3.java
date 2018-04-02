class AutoBox3 {
    public static void main(String[] args) {

        Integer iOb1, iOb2;
        int i;

        iOb1 = 100;
        System.out.println("Original value of iOb1: " + iOb1);
        
        // unbox, increment, box
        ++iOb1; 
        System.out.println("New value of iOb1: " + iOb1);

        // unbox, evaluate, rebox, assign to iOb2
        iOb2 = iOb1 + (iOb1 / 3);
        System.out.println("iOb2 after expression: " + iOb2);

        // evaluate the smae expression with out reboxing
        i = iOb1 + (iOb1 / 3);
        System.out.println("i after expression: " + i);
    }
}